package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public ProfilePage clickOnCountrySelect(String country) {
        clickElement(By.xpath("//*[@id = 'select2-ProfileOffice_country__id-container']"));
//        Select select = new Select(driver.findElement(By.xpath("//*[@id = 'select2-ProfileOffice_country__id-container']")));
//        select.selectByValue(country);
        return this;
    }
}
