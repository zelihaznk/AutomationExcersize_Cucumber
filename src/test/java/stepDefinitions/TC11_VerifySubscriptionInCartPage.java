package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutomationPage;

public class TC11_VerifySubscriptionInCartPage {
    AutomationPage page = new AutomationPage();
    @And("Click Cart button")
    public void clickCartButton() {
        page.cartButton.click();
    }
}
