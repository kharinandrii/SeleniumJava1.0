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

    public OfficePage checkAdminStatus() {
        WebElement element = driver.findElement(By.xpath("//*[@class = 'panel_user_name']/span"));
        String adminStatus = element.getText();
        put("admin", adminStatus);
        return this;
    }


}
