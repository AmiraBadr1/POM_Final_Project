package org.example.pages;

import org.example.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DuckGoSearchResultsPage extends Base {

    private By searchElements = By.className("eVNpHGjtxRBq_gLOfGDr");

    public List<WebElement> getSearchItemList() {
        return driver.findElements(searchElements);
    }

    public String getFirstResultLinkHref() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(getSearchItemList()));
        return driver.findElements(searchElements).get(0).getAttribute("href");
    }

    public String getFourthSearchResultTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(getSearchItemList()));
        return driver.findElements(searchElements).get(3).getAttribute("text");
    }


public WebElement secondResult(){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    return wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(searchElements).get(1)));
}

public void clickOnSecondResult(){
        secondResult().click();
}

    public String getCurrentUrl(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(getSearchItemList()));
        return driver.getCurrentUrl();
    }




}


