package stepDefinitions;

import io.cucumber.java.en.Then;
import org.example.base.Base;
import org.example.pages.W3schoolsTablePage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class S07_CountryAssertion extends Base {
    W3schoolsTablePage tablePage;
    @Then("The country for the company {string} should be {string}")
    public void the_country_for_the_company_should_be(String company, String expectedCountry) {
        W3schoolsTablePage tablePage = new W3schoolsTablePage(driver);

        assertTrue("Company not found in table", tablePage.isCompanyPresent(company));

        String actualCountry = tablePage.getCountryForCompany(company);
        assertEquals("Country mismatch", expectedCountry, actualCountry);
    }
}
