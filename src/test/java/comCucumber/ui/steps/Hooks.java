package comCucumber.ui.steps;

import Tools.Params;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import pages.ui.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    MainPage mainPage = new MainPage();
    Params params = new Params();
    @Before
    public void openURL() {
        Configuration.startMaximized = true;
        open(params.UI_URL);
    }
}
