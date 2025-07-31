package stepDefinitions;

import org.example.base.Base;
import org.example.pages.DuckGoHomePage;
import org.example.pages.DuckGoSearchResultsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class S03_LinkAssertion extends Base {

    DuckGoHomePage homePage;
    DuckGoSearchResultsPage searchPage;

    @When("User searches for {string}")
    public void User_searches_for(String searchWord){
        homePage = new DuckGoHomePage();

        homePage.searchFor(searchWord);
    }

    @Then("The first result link should be {string}")
    public void The_first_result_link_should_be(String expectedHref){
        searchPage = new DuckGoSearchResultsPage();

      assertEquals("First result URL is incorrect", expectedHref, searchPage.getFirstResultLinkHref());

    }
}
