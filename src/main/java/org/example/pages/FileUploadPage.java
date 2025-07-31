package org.example.pages;

import org.example.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.time.Duration;

public class FileUploadPage extends Base {

    private By uploadInput = By.id("file-upload");
    private By uploadBtn = By.id("file-submit");
    private By uploadedHeader = By.tagName("h3");

    public WebElement uploadInputElement(){
        return driver.findElement(uploadInput);
    }

    public WebElement uploadBtnElement(){
        return driver.findElement(uploadBtn);
    }


    public void uploadPhoto(String imagePath){
        uploadInputElement().sendKeys(imagePath);
    }

    public void clickOnUploadButton(){
        uploadBtnElement().click();
    }

    public String getActualText(){
        return driver.findElement(uploadedHeader).getText();
   }

}
