package pages;
import static Tools.RunContext.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage fillLoginField(String login) {
        clearField(By.xpath("//*[@id = 'LoginForm_username']"));
        fillField(By.xpath("//*[@id = 'LoginForm_username']"), login);
        put("login", login);
        return this;
    }
    public LoginPage fillPasswordField(String password) {
        clearField(By.xpath("//*[@id = 'LoginForm_password']"));
        fillField(By.xpath("//*[@id = 'LoginForm_password']"), password);
        return this;
    }
    public LoginPage clickLoginButton() {
        clickElement(By.xpath("//*[text() = 'Авторизоваться']"));
        return this;
    }

} //todo продолжить просмотр с https://www.youtube.com/watch?v=qhJ-Lfo-xu0&list=PLkcxxftlu7Qp58v7q5ssSYjtpwIjngFZ3&index=2 и сделать проверку на кол-во в корзине
