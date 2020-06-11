import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;
import pages.MainPage;
import pages.OfficePage;

public class BasicTest {
    public MainPage mainPage;
    public LoginPage loginPage;
    public OfficePage officePage;
    WebDriver driver;

    @BeforeTest
    public void config() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        officePage = PageFactory.initElements(driver, OfficePage.class);
    }
    @AfterTest
    public void quit() {
        driver.quit();
    }
}
