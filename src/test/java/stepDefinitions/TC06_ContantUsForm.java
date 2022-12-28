package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutomationPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TC06_ContantUsForm {

    AutomationPage page = new AutomationPage();

    @And("Click on Contact Us button")
    public void clickOnContactUsButton() {
        page.contactUs.click();
    }

    @Then("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
        assertTrue(page.getInTouchTitle.isDisplayed());
    }

    @And("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() {
        page.nameBoxContact.sendKeys(Faker.instance().name().firstName());
        page.emailBoxContact.sendKeys(Faker.instance().internet().emailAddress());
        page.subjectBoxContact.sendKeys(Faker.instance().toString());
        page.messageBoxContact.sendKeys(Faker.instance().toString());
    }

    @And("Upload file")
    public void uploadFile() {
        String fis = "C:\\Users\\Zeliha Öznük\\Desktop\\ZELİHA\\Automationexercise\\src\\resources\\car-2.jpg";
        page.uploadFile.sendKeys(fis);
    }

    @And("Click Submit button")
    public void clickSubmitButton() {
        ReusableMethods.jsScrollClick(page.submitContact);
    }

    @And("Click OK button")
    public void clickOKButton() {
        ReusableMethods.waitFor(3);
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        assertTrue(page.successMessage.isDisplayed());
    }

    @And("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        page.homeButtonContact.click();
        String expectedData = "https://www.automationexercise.com/";
        String actualData = Driver.getDriver().getCurrentUrl();
        Driver.getDriver().navigate().refresh();
        assertEquals(expectedData,actualData);
    }
}
