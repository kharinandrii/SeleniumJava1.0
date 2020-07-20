package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public void clickButton(String text) {
        $(By.xpath("//*[text() = '" + text +"']"));
    }
}
