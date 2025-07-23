package pages.duckduckgo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DuckDuckGoHomePage {
    WebDriver driver;
    private WebDriverWait wait;

    private By searchBox = By.id("searchbox_input");
    private By logo = By.xpath("//*[@id=\"__next\"]/div/main/article/div[1]/div[1]/div[2]/div/header/div/section[1]/a/img");
    private By resultLinks = By.className("eVNpHGjtxRBq_gLOfGDr");


    public DuckDuckGoHomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String actualTitle() {
        return driver.getTitle();
    }

    public void search(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword + "\n");
    }

    public boolean isLogoVisible() {
        return driver.findElement(logo).isDisplayed();
    }

    public List<WebElement> getSearchResults() {
        return driver.findElements(resultLinks);
    }

    public String getFirstResultLink() {
        return getSearchResults().get(0).getAttribute("href");
    }

}