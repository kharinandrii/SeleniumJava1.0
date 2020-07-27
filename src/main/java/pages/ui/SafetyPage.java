package pages.ui;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SafetyPage {
    SelenideElement advancedButton = $(By.xpath("//*[@id = 'details-button']")),
                    registerLink = $(By.xpath("//*[@id = 'proceed-link']"));

    public SafetyPage clickOnAdvanced() {
        advancedButton.click();
        return this;
    }
    public SafetyPage clickOnRegisterLink() {
        registerLink.click();
        return this;
    }
}
