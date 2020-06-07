package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstTaskPage extends BasePage {
    public FirstTaskPage(WebDriver driver) {
        super(driver);
    }
    public FirstTaskPage checkTask(String taskNumber) {
        isElementDisplayed(By.xpath("//*[text() = 'Zadanie " +taskNumber +"']"));
        return this;
    }
}
