package comCucumber.ui.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ui.BasePage;
import pages.ui.MainPage;
import pages.ui.RegisterPage;
import pages.ui.SafetyPage;

public class MainPageStep extends BasePage {
    MainPage mainPage = new MainPage();
    RegisterPage registerPage = new RegisterPage();
    SafetyPage safetyPage = new SafetyPage();
    @Given("click on {string} button")
    public void clickOnButton(String text) {
        mainPage.clickOnDrobDown();
        clickButton(text);
    }

    @When("click on Advanced button")
    public void clickOnAdvancedButton() {
        safetyPage.clickOnAdvanced()
                .clickOnRegisterLink();
    }

    @When("fill first name field on register page")
    public void fillFirstNameFieldOnRegisterPage() {
        registerPage.fillNameField();

    }

    @When("fill last name in field on register page")
    public void fillLastNameInFieldOnRegisterPage() {
        registerPage.fillLastNameField();
    }

    @When("fill email in email field")
    public void fillEmailInEmailField() {
        registerPage.fillEmailField();
    }

    @When("fill phone number in field")
    public void fillPhoneNumberInField() {
        registerPage.fillPhoneNumber();
    }

    @When("fill first adress")
    public void fillFirstAdress() {
        registerPage.fillAddressField();
    }

    @When("fill city field")
    public void fillCityField() {
        registerPage.fillCityField();
    }

    @When("fill postcode")
    public void fillPostcode() {
        registerPage.fillPostCode();
    }

    @When("choose region")
    public void chooseRegion() {
        registerPage.chooseRegion();
    }

    @When("fill password {string} in field")
    public void fillPasswordInField(String password) {
        registerPage.fillPassword(password);
    }

    @When("fill password {string} in confirm field")
    public void fillPasswordInConfirmField(String password) {
        registerPage.fillPasswordConfirm(password);
    }

    @When("click on agree checkbox")
    public void clickOnAgreeCheckbox() {
        registerPage.clickOnCheckbox();
    }

    @When("click on Continue button")
    public void clickOnContinueButton() {
        registerPage.clickOnContinueButton();
    }
}
