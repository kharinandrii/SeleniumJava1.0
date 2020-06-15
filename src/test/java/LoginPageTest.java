import dataProviderPack.ExellReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends BasicTest {




    @Test(dataProvider = "loginExellDataProvider", dataProviderClass = ExellReader.class)
    public void firstTaskTest(String login, String password) {
        mainPage.goTo()
                .OpenLoginPage();
        loginPage
        .fillLoginField(login)
                .fillPasswordField(password)
                .clickLoginButton();
        officePage.checkUserLogin()
                .openDrobDownMenu()
                .clickExit();



    }


}






























































































