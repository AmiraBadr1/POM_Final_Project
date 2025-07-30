package stepDefinitions;

import org.example.base.Base;
import org.example.pages.DuckGoHomePage;
import org.example.pages.DuckGoSearchResultsPage;
import org.example.pages.SecondSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

public class S05_SecondLinkAssertion extends Base {

    DuckGoHomePage homePage;
    DuckGoSearchResultsPage searchPage;
    SecondSearchPage secondPage;

    @And("User goes to the second page of results")
    public void User_goes_to_the_second_page_of_results(){
        searchPage = new DuckGoSearchResultsPage();

        searchPage.secondResult();
        searchPage.clickOnSecondResult();



    }
    @Then("the page link should be {string}")
    public void the_page_link_should_be(String expectedLink) {

        secondPage = new SecondSearchPage();
        System.out.println("Expected Link = " + expectedLink);
        System.out.println("Actual URL = " + secondPage.getCurrentUrl());
        assertTrue("The page URL NOT contain the expected link", secondPage.containsAsExpected(expectedLink));

        System.out.println("The page URL is correct: " + secondPage.getCurrentUrl());

    }
}
