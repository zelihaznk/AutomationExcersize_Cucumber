package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AutomationPage;

import utilities.ReusableMethods;

public class UI_TC02_LoginUserCorrect {

    AutomationPage page = new AutomationPage();

    @And("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        Assert.assertTrue(page.loginToYourAccountText.isDisplayed());
    }
    @And("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {
        page.emailBoxLogin.sendKeys(Register.email);
        page.passwordBoxLogin.sendKeys(Register.password);
    }
    @And("Click login button")
    public void clickLoginButton() {
        ReusableMethods.jsScrollClick(page.loginButton);
    }
    @And("Verify that ACCOUNT DELETED! is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
        Assert.assertTrue(page.accountDeletedText.isDisplayed());
    }
}
