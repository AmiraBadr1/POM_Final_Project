package org.example.pages;

import org.example.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HerokuCheckboxPage extends Base {
    WebDriver driver;

    public HerokuCheckboxPage(WebDriver driver) {
        this.driver = driver;
    }
    private By checkBoxes = By.id("checkboxes");
    private By firstCheckBox = By.xpath("//*[@id='checkboxes']/input[1]");
    private By secondCheckBox = By.xpath("//*[@id='checkboxes']/input[2]");
    public List<WebElement> allCheckBoxes() {
        return driver.findElements(checkBoxes);
    }
    public WebElement waitForFirstCheckboxToBeClickable (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(firstCheckBox));
    }

    public void clickOnFirstCheckbox(){
        waitForFirstCheckboxToBeClickable().click();
    }
    public WebElement waitForFirstCheckboxToBeSelected() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(firstCheckBox));
    }
    public WebElement waitForSecondCheckboxToBeSelected() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(secondCheckBox));
    }

    public List<Boolean> getCheckboxesSelectionState() {

        List<Boolean> states = new ArrayList<>();

        for (WebElement checkbox : allCheckBoxes()) {
            states.add(checkbox.isSelected());
        }
        return states;
    }

}


