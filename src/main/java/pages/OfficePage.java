package pages;

import Tools.Params;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static Tools.RunContext.*;

public class OfficePage extends BasePage {


    public OfficePage(WebDriver driver) {
        super(driver);
    }
    Params params = new Params();

    public OfficePage checkUserLogin() {
        WebElement element = driver.findElement(By.xpath("//*[@class = 'panel_user_name']/span"));
        String adminStatus = element.getText();
        String expected = get("login", String.class);
        assert adminStatus.equals(expected);
        return this;
    }
    public OfficePage openDrobDownMenu() {
        clickElement(By.xpath("//*[@class = 'header_branding__user_name']/span"));
        return this;
    }
    public OfficePage clickExit() {
        clickElement(By.xpath("//*[text() = 'Выход']"));
        return this;
    }

}
