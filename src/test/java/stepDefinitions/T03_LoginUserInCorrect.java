package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationPage;

public class T03_LoginUserInCorrect {

    AutomationPage page = new AutomationPage();
    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        page.emailBoxLogin.sendKeys("mahmut@gmail.com");
        page.passwordBoxLogin.sendKeys("qwert1233.");
    }
    @And("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertTrue(page.yourEmailOrPasswordIsIncorrect.isDisplayed());
    }
}
