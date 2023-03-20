package com.StepDefinition;

import com.Pages.MainPage;
import com.Utilities.BrowserUtilities;
import com.Utilities.ConfigurationReader;
import com.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SearchButton {
    MainPage mainPage = new MainPage();

    @Given("user should on mainPage")
    public void userShouldOnMainPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @And("verify title {string}")
    public void verifyTitle(String title) {
        BrowserUtilities.titleVerify(title);
    }

    @And("verify color change when hover on the searchButton")
    public void verifyColorChangeWhenHoverOnTheSearchButton() {
        BrowserUtilities.highlight(mainPage.submitButtonColorChange);
        BrowserUtilities.VerifyBackgroundColorChange(mainPage.submitButtonColorChange,"#febd69");
        BrowserUtilities.hover(mainPage.submitButtonColorChange);
        BrowserUtilities.VerifyBackgroundColorChange(mainPage.submitButtonColorChange,"#f3a847");

    }

    @When("User click search area and write {string} and click submitButton")
    public void userClickSearchAreaAndWriteAndClickSubmitButton(String text) {
        BrowserUtilities.highlight(mainPage.searchBox);
        mainPage.searchBox.click();
        mainPage.searchBox.sendKeys(text);
        BrowserUtilities.waitFor(5);
        mainPage.submitButton.click();

    }


    @And("verify color change when hover on the searchButton {string} and {string}")
    public void verifyColorChangeWhenHoverOnTheSearchButtonAnd(String beforeColor, String afterColor) {
        BrowserUtilities.highlight(mainPage.submitButtonColorChange);
        BrowserUtilities.VerifyBackgroundColorChange(mainPage.submitButtonColorChange,beforeColor);
        BrowserUtilities.hover(mainPage.submitButtonColorChange);
        BrowserUtilities.VerifyBackgroundColorChange(mainPage.submitButtonColorChange,afterColor);

    }
}
