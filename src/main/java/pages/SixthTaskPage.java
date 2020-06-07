package pages;

import Tools.Params;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static Tools.RunContext.*;

public class SixthTaskPage extends BasePage {


    public SixthTaskPage(WebDriver driver) {
        super(driver);
    }
    Params params = new Params();

    public SixthTaskPage openDetails() {
        clickElement(By.cssSelector(".open-details"));
        return this;
    }
    public SixthTaskPage putLogin() {
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Użytkownik:')]"));
        String login = element.getText().substring(12);
        System.out.println(login);
        put("login", login);
        return this;
    }

    public SixthTaskPage putPassword() {
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Hasło:')]"));
        String password = element.getText().substring(7);
        put("password", password);
        return this;
    }



    public SixthTaskPage fillLoginForm() {
        waitVisibility(By.xpath("//*[@id = 'LoginForm__username']"));
        String loginValue = get("login", String.class);
        fillField(By.xpath("//*[@id = 'LoginForm__username']"), loginValue);
        return this;
    }
    public SixthTaskPage fillPasswordForm() {
        String passwordValue = get("password", String.class);
        fillField(By.xpath("//*[@id ='LoginForm__password']"), passwordValue);
        return this;
    }
    public SixthTaskPage clickLoginButton() {
        clickElement(By.xpath("//*[@id = 'LoginForm_save']"));
        return this;
    }
    public void checkLinkText () {
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Pobierz plik')]"));
        String actual = element.getText();
        String expected = params.SIXTH_TEST_LINK;
        assert actual.equals(expected);
    }

}
