package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.base.Base;
import org.example.pages.FileUploadPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static org.junit.Assert.assertEquals;

public class S08_FileUpload extends Base {

    FileUploadPage fileUploadPage;

    @When("User uploads the file {string}")
    public void user_uploads_the_file(String imagePath) {
        fileUploadPage = new FileUploadPage();
        fileUploadPage.uploadPhoto(imagePath);
        fileUploadPage.clickOnUploadButton();
    }
    @Then("The file should be uploaded successfully")
    public void the_file_should_be_uploaded_successfully() {
        fileUploadPage = new FileUploadPage();
        assertEquals("File Uploaded!",  fileUploadPage.getActualText());
    }

}
