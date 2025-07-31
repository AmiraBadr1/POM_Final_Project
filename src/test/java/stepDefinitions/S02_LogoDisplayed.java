package stepDefinitions;

import io.cucumber.java.en.Then;
import org.example.base.Base;
import org.example.pages.DuckGoHomePage;

import static org.junit.Assert.assertTrue;

public class S02_LogoDisplayed extends Base {

    DuckGoHomePage homePage;

    @Then("DuckDuckGo logo should be visible")
    public void duckDuckGo_logo_should_be_visible(){
        homePage = new DuckGoHomePage();
        assertTrue("DuckDuckGo logo should be visible", homePage.waitForLogoToBeClickable().isDisplayed());
    }

}
