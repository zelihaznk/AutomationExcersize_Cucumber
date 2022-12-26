package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class T04_LogoutUser {

    AutomationPage page = new AutomationPage();
    @And("Click Logout button")
    public void clickLogoutButton() {
        ReusableMethods.jsScrollClick(page.logoutButton);
    }

    @And("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        page.loginToYourAccountText.isDisplayed();
    }
}