package stepDefinitions;

import org.example.base.Base;
import org.example.pages.DuckGoHomePage;
import org.example.pages.DuckGoSearchResultsPage;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class S04_TextAssertion extends Base {
    DuckGoHomePage homePage;
    DuckGoSearchResultsPage searchPage;

    @Then("The text of the fourth result should be {string}")
    public void Then_The_text_of_the_third_result_should_be(String expectedWord){

        searchPage = new DuckGoSearchResultsPage();
        assertEquals("fourth result text is correct", expectedWord, searchPage.getFourthSearchResultTest());

    }
}
