package com.StepDefinition;

import com.Pages.MainPage;
import com.Utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SelectYourAddress {
    MainPage mainPage = new MainPage();

    @When("user should click Select your address module")
    public void userShouldClickSelectYourAddressModule() {
        BrowserUtilities.highlight(mainPage.SelectYourAddress);
        mainPage.SelectYourAddress.click();
        BrowserUtilities.highlight(mainPage.chooseYourLocationPopUpHeadLine);
        Assert.assertEquals("Choose your location", mainPage.chooseYourLocationPopUpHeadLine.getText());
    }


    @And("enter zipcode and submit apply button.")
    public void enterZipcodeAndSubmitApplyButton(String zipcode) {
        BrowserUtilities.highlight(mainPage.chooseYourLocationEnterZipcodeArea);
        mainPage.chooseYourLocationEnterZipcodeArea.sendKeys(zipcode);
        BrowserUtilities.highlight(mainPage.chooseYourLocationApplyButton);
        mainPage.chooseYourLocationApplyButton.click();
    }

    @And("click Change button")
    public void clickChangeButton() {
        BrowserUtilities.highlight(mainPage.changeButton);
        mainPage.changeButton.click();
    }
}

