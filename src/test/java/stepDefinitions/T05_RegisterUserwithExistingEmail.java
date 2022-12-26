package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class T05_RegisterUserwithExistingEmail {

    AutomationPage page = new AutomationPage();
    @And("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        page.nameBoxSignup.sendKeys(ConfigReader.getProperty("name"));
        page.emailBoxSignup.sendKeys(ConfigReader.getProperty("email"));
    }
    @And("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        page.emailAlreadyExistText.isDisplayed();
    }
}
