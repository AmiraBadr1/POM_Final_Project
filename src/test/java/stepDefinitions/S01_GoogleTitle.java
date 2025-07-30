package stepDefinitions;

import org.example.base.Base;
import org.example.pages.DuckGoHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

public class S01_GoogleTitle extends Base {

    DuckGoHomePage homePage;

    @Given("User opens {string} browser {string}")
    public void user_opens_chrome_browser(String browser,String url) {

        lunchBrowser(browser,url);
        System.out.println(driver);
        homePage = new DuckGoHomePage(driver);

    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {

        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("Title we got = " + homePage.actualTitle());
        assertTrue("Title should not be "+ expectedTitle, homePage.containsUnexpected(expectedTitle));

    }


}
