package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstTaskPage extends BasePage {
    public FirstTaskPage(WebDriver driver) {
        super(driver);
    }
    public FirstTaskPage checkTask(String taskNumber) {
        isElementDisplayed(By.xpath("//*[text() = 'Zadanie " +taskNumber +"']"));
        return this;
    }
    public FirstTaskPage fillNumericField(String number) {
        clearField(By.xpath("//*[//text() ='Okulary']//*[@type = 'number']"));
        fillField(By.xpath("//*[//text() ='Okulary']//*[@type = 'number']"), number);
        return this;
    }
    public FirstTaskPage clickDodajButton() {
        clickElement(By.xpath("//*[//text() ='Okulary']/button[@data-product-name = 'Okulary' and text() = 'Dodaj']"));
        int i = 2;
        return this;
    }
} //todo продолжить просмотр с https://www.youtube.com/watch?v=qhJ-Lfo-xu0&list=PLkcxxftlu7Qp58v7q5ssSYjtpwIjngFZ3&index=2
