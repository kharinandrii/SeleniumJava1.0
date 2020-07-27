package pages.ui;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static Tools.RunContext.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class RegisterPage extends MainPage {

    SelenideElement nameField = $(By.xpath("//*[@id = 'input-firstname']")),
                    lastNameField = $(By.xpath("//*[@id = 'input-lastname']")),
                    emailField = $(By.xpath("//*[@id = 'input-email']")),
                    phoneNumberField = $(By.xpath("//*[@id = 'input-telephone']")),
                    address1Field = $(By.xpath("//*[@id = 'input-address-1']")),
                    cityField = $(By.xpath("//*[@id = 'input-city']")),
                    postCodeField = $(By.xpath("//*[@id = 'input-postcode']")),
                    selectRegion = $(By.xpath("//*[@id = 'input-zone']")),
                    passwordField = $(By.xpath("//*[@id = 'input-password']")),
                    passwordConfirdField = $(By.xpath("//*[@id = 'input-confirm']")),
                    checkboxSelect = $(By.xpath("//*[@name = 'agree']")),
                    continueButton = $(By.xpath("//*[@value = 'Continue']"));

    public RegisterPage fillNameField() {
        String name = getName();
        put("name", name);
        nameField.val(name);
        return page(RegisterPage.class);
    }

    public RegisterPage fillLastNameField() {
        String lastName = getFamilyName();
        lastNameField.val(lastName);
        return page(RegisterPage.class);
    }

    public RegisterPage fillEmailField() {
        String email = get("name", String.class) + "@test.com";
        emailField.val(email);
        return page(RegisterPage.class);
    }
    public RegisterPage fillPhoneNumber() {
        String phoneNumber = getPhoneNumber();
        phoneNumberField.val(phoneNumber);
        return page(RegisterPage.class);
    }

    public RegisterPage fillAddressField() {
        String address = getAddress();
        address1Field.val(address);
        return page(RegisterPage.class);
    }
    public RegisterPage fillCityField() {
        String city = getCity();
        cityField.val(city);
        return this;
    }
    public RegisterPage fillPostCode() {
        String postCode = getPostCode();
        postCodeField.val(postCode);
        return page(RegisterPage.class);
    }
    public RegisterPage chooseRegion() {
        selectRegion.selectOptionByValue("3513");
        return this;
    }
    public RegisterPage fillPassword(String password) {
        passwordField.val(password);
        return page(RegisterPage.class);
    }
    public RegisterPage fillPasswordConfirm(String password) {
        passwordConfirdField.val(password);
        return page(RegisterPage.class);
    }
    public RegisterPage clickOnCheckbox() {
        checkboxSelect.click();
        return page(RegisterPage.class);
    }
    public RegisterPage clickOnContinueButton() {
        continueButton.click();
        return this;
    }
}
