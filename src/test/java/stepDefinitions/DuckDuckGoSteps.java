package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.duckduckgo.DuckDuckGoHomePage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class DuckDuckGoSteps {
    WebDriver driver;

    DuckDuckGoHomePage homePage;

    @Given("User opens chrome browser and navigates to DuckDuckGo")
    public void openChromeAndNavigate() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://duckduckgo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage = new DuckDuckGoHomePage(driver);
    }

    @Then ("the page title should be {string}")
     public void the_page_title_should_be(String unexpectedTitle)
    {
        System.out.println("actual Title is "+ homePage.actualTitle());
        assertTrue("Title should not be "+ unexpectedTitle, homePage.actualTitle().toLowerCase().contains(unexpectedTitle.toLowerCase()));
        driver.quit();
    }

    @Then("DuckDuckGo logo should be displayed")
    public void checkLogoVisible() {
        Assert.assertTrue(homePage.isLogoVisible());
        driver.quit();
    }

    @When("User searches for {string}")
    public void search(String keyword) {
        homePage.search(keyword);
    }

    @Then("The first result link should be {string}")
    public void validateFirstLink(String expectedLink) {

        Assert.assertEquals(expectedLink, homePage.getFirstResultLink());
        driver.quit();
    }

}