package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.FirstTaskPage;
import pages.MainPage;
import pages.SixthTaskPage;

public class BasicTest {
    public MainPage mainPage;
    public FirstTaskPage firstTaskPage;
    public SixthTaskPage sixthTaskPage;
    WebDriver driver;

    @BeforeTest
    public void config() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        firstTaskPage = PageFactory.initElements(driver, FirstTaskPage.class);
        sixthTaskPage = PageFactory.initElements(driver, SixthTaskPage.class);
    }
    @AfterTest
    public void quit() {
        driver.quit();
    }
}
