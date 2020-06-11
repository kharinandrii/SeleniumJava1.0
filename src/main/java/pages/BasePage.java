package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    String URL = "https://teamring.tcl.ukrtech.info/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,15);
    }
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
    public void clickElement(By elementBy) {
        waitVisibility((By) elementBy);
        driver.findElement(elementBy).click();
    }
    public void isElementDisplayed(By elementBy) {
        waitVisibility(elementBy);
        assert(driver.findElement(elementBy).isDisplayed());

    }

    public void fillField(By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    public void getElementText(By elementBy) {
        driver.findElement(elementBy).getText();
    }

    public void clearField(By elementBy) {
        driver.findElement(elementBy).clear();
    }
}

