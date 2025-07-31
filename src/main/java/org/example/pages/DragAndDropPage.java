package org.example.pages;

import org.example.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragAndDropPage extends Base {
    private WebDriver driver;

    public DragAndDropPage (WebDriver driver) {
        this.driver = driver;
    }
    private By source = By.id("draggable");
    private By target = By.id("droppable");

    public WebElement getSourceElement() {
        return driver.findElement(source);
    }

    public WebElement getTargetElement() {
        return driver.findElement(target);
    }

    public String actualText() {
        return getTargetElement().getText();
    }

}
