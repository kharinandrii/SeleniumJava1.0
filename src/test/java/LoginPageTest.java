import Tools.Params;
import org.testng.annotations.Test;

public class LoginPageTest extends BasicTest {
    Params params = new Params();

    @Test
    public void firstTaskTest() {
        mainPage.goTo()
                .OpenLoginPage();
        loginPage
        .fillLoginField(params.ADMIN_LOGIN)
                .fillPasswordField(params.ADMIN_PASSWORD)
                .clickLoginButton();



    }


}






























































































