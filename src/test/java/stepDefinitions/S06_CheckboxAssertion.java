package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.base.Base;
import org.example.pages.HerokuCheckboxPage;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;

public class S06_CheckboxAssertion extends Base {

    HerokuCheckboxPage checkboxPage;

    @When("User checks the first checkbox if not already checked")
    public void User_checks_the_first_checkbox_if_not_already_checked(){
        checkboxPage = new HerokuCheckboxPage(driver);
        checkboxPage.clickOnFirstCheckbox();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Then("Both checkboxes should be checked")
    public void both_checkboxes_should_be_checked() {
        HerokuCheckboxPage checkboxPage = new HerokuCheckboxPage(driver);
        checkboxPage.waitForFirstCheckboxToBeClickable ();

            assertTrue(checkboxPage.waitForFirstCheckboxToBeSelected().isSelected());
            assertTrue(checkboxPage.waitForSecondCheckboxToBeSelected().isSelected());
        }
    }

