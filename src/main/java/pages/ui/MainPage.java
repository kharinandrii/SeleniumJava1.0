package pages.ui;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BasePage {

    SelenideElement drobDown = $(By.xpath("//*[@class = 'dropdown']//*[text() = 'My Account']"));
//                    button = $(By.xpath("//*[text() = 'Register']"));

    public SafetyPage clickOnDrobDown() {
        drobDown.click();
        return page(SafetyPage.class);
    }






}
