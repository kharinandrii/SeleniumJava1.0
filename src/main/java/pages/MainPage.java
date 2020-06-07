package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage (WebDriver driver) {
        super(driver);
    }


    public MainPage goTo() {
        driver.get(URL);
        return this;
    }

    public MainPage chooseTask(String taskNumber) {
        clickElement(By.xpath("//*[text() = 'Zadanie "+ taskNumber+"']"));
        return this;
    }

}
