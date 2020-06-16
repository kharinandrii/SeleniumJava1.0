import dataProviderPack.ExellReader;
import org.testng.annotations.Test;

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
                .openDrobDownMenu();
                if(login.equals("joypy3")){
                    officePage.chooseProfileMenu();
                    profilePage.chooseCountry("Украина")
                    .chooseRegion("100");
                }else {
                    officePage.clickExit();
                }


    }


}






























































































