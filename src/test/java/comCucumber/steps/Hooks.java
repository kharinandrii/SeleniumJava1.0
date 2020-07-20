package comCucumber.steps;

import Tools.Params;
import io.cucumber.java.Before;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    MainPage mainPage = new MainPage();
    Params params = new Params();
    @Before
    public void openURL() {
        open(params.TEST_URL);
    }
}
