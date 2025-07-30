package org.example.pages;

import org.example.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DuckGoHomePage extends Base {



    private By logo = By.xpath("//*[@id=\"__next\"]/div/main/article/div[1]/div[1]/div[2]/div/header/div/section[1]/a/img");

    private By searchBox = By.id("searchbox_input");

    public DuckGoHomePage(WebDriver driver) {
        super();
    }

    public DuckGoHomePage() {

    }


    public WebElement waitForLogoToBeClickable() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(logo));
    }

    public WebElement waitForSearchBoxToBeClickable(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(searchBox));
    }

    public void searchFor(String searchWord) {

        waitForSearchBoxToBeClickable().sendKeys(searchWord + Keys.ENTER);
    }


//#1
    public String actualTitle() {
        return driver.getTitle();
    }
    //#1
    public boolean containsUnexpected(String expectedTitle) {
      return actualTitle().toLowerCase().contains(expectedTitle.toLowerCase());
    }

}
