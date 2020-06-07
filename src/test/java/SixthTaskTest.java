import org.testng.annotations.Test;
import steps.BasicTest;

public class SixthTaskTest extends BasicTest {
    @Test
    public void SixTaskTest(){
        mainPage.goTo()
                .chooseTask("6");
        firstTaskPage.checkTask("6");
        sixthTaskPage.openDetails()
                .putLogin()
                .putPassword()
                .fillLoginForm()
                      .fillPasswordForm()
                      .clickLoginButton()
                .checkLinkText();

    }
}
