package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.AutomationPage;

public class UI_TC03_LoginUserInCorrect {

    AutomationPage page = new AutomationPage();
    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        page.emailBoxLogin.sendKeys("zeliss@gmail.com");
        page.passwordBoxLogin.sendKeys("qwert1233.");
    }
    @And("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertTrue(page.yourEmailOrPasswordIsIncorrect.isDisplayed());
    }
}
