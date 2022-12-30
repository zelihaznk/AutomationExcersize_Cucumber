package stepDefinitions;

import io.cucumber.java.en.And;
import pages.AutomationPage;
import utilities.ConfigReader;

public class UI_TC05_RegisterUserwithExistingEmail {

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
