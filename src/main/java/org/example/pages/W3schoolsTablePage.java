package org.example.pages;

import org.example.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class W3schoolsTablePage extends Base {
    private WebDriver driver;

    private By tableLocator = By.id("customers");
    public W3schoolsTablePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCountryForCompany(String company) {
        WebElement table = driver.findElement(By.id("customers"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() > 0 && cells.get(0).getText().equalsIgnoreCase(company)) {
                return cells.get(2).getText();
            }
        }
        return null;
    }

    public boolean isCompanyPresent(String company) {
        WebElement table = driver.findElement(By.id("customers"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() > 0 && cells.get(0).getText().equalsIgnoreCase(company)) {
                return true;
            }
        }
        return false;
    }
}