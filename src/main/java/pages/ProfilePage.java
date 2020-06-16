package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public ProfilePage chooseCountry(String country) {
        Select select = new Select(driver.findElement(By.xpath("//*[@id = 'ProfileOffice_country__id']")));
        select.selectByVisibleText(country);
        return this;
    }
    public ProfilePage chooseRegion(String value) {
        Select select = new Select(driver.findElement(By.xpath("ProfileOffice_region__id")));
        select.selectByValue(value);
        return this;
    }
}
