import org.testng.annotations.Test;

public class FirstTaskTest extends BasicTest {


    @Test
    public void firstTaskTest() {
        mainPage.goTo()
                .chooseTask("1");
        firstTaskPage.checkTask("1")
        .fillNumericField("2")
        .clickDodajButton();

    }


}






























































































