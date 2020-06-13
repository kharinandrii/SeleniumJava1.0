import dataProviderPack.ExellReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends BasicTest {


    @DataProvider(name = "loginExellDataProvider")
    public Object[][] exelData() throws IOException {
        return new ExellReader().readXls();
    }

    @Test(dataProvider = "loginExellDataProvider")
    public void firstTaskTest(String login, String password) {
        mainPage.goTo()
                .OpenLoginPage();
        loginPage
        .fillLoginField(login)
                .fillPasswordField(password)
                .clickLoginButton();
        officePage.checkUserLogin();



    }


}






























































































