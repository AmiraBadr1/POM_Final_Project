package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.base.Base;
import org.example.pages.DragAndDropPage;
import org.openqa.selenium.interactions.Actions;
import static org.junit.Assert.assertEquals;

public class S09_DragAndDrop extends Base {
   DragAndDropPage dragDropPage;

    @When("User drags the draggable element and drops it into the target")
    public void user_drags_and_drops_element() {
        dragDropPage = new DragAndDropPage(driver);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragDropPage.getSourceElement(),dragDropPage.getTargetElement()).perform();
    }
    @Then("The drop area text should be {string}")
    public void the_drop_area_text_should_be(String expectedText) {

        assertEquals("Drop result text does not match",expectedText,dragDropPage.actualText());
    }

}
