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

    public MainPage OpenLoginPage() {
        clickElement(By.xpath("//*[text() = 'Войти']"));
        return this;
    }

}
