package pages.ui;

import org.openqa.selenium.By;
import com.github.javafaker.Faker;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    Faker faker = new Faker();
    public void clickButton(String text) {
        $(By.xpath("//*[text() = '" + text +"']")).click();
    }
    public String getName() {
        return faker.name().firstName();
    }

    public String getFamilyName() {
        return faker.name().lastName();
    }
    public String getPhoneNumber() {
        return faker.phoneNumber().phoneNumber();
    }

    public String getAddress() {
        return faker.address().streetAddress();
    }
    public String getCity() {
        return faker.address().city();
    }
    public String getPostCode() {
        return faker.address().zipCode();
    }
}
