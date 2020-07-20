package comCucumber.steps;

import io.cucumber.java.en.Given;
import pages.BasePage;
import pages.MainPage;

public class MainPageStep extends BasePage {
    MainPage mainPage = new MainPage();
    @Given("click on {string} button")
    public void clickOnButton(String text) {
        mainPage.clickOnDrobDown();
        clickButton(text);
    }
}
