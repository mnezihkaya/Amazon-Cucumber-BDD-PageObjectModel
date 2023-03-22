package com.StepDefinition;

import com.Pages.ChangeCountryRegion;
import com.Pages.MainPage;
import com.Utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class LanguageModule {
    MainPage mainPage = new MainPage();
    ChangeCountryRegion changeCountryRegion = new ChangeCountryRegion();

    @When("user hover over the language module")
    public void userHoverOverTheLanguageModule() {
        BrowserUtilities.highlight(mainPage.chooseLanguageForShopping);
        BrowserUtilities.hover(mainPage.chooseLanguageForShopping);
    }

    @And("user Should see learnMore Link")
    public void userShouldSeeLearnMoreLink() {
        BrowserUtilities.highlight(mainPage.learnMore);
        mainPage.learnMore.isDisplayed();
    }

    @And("user should click learnMore Link")
    public void userShouldClickLearnMoreLink() {
        mainPage.learnMore.click();
    }

    @And("user Should see Change Country Region Link")
    public void userShouldSeeChangeCountryRegionLink() {
        BrowserUtilities.highlight(mainPage.changeCountryRegion);
        mainPage.changeCountryRegion.isDisplayed();
    }

    @And("user should click Change Country Region Link")
    public void userShouldClickChangeCountryRegionLink() {
        mainPage.changeCountryRegion.click();
    }

    @And("select country {string}")
    public void selectCountry(String country) {
        BrowserUtilities.highlight(changeCountryRegion.SelectYourPreferredCountry);
        changeCountryRegion.SelectYourPreferredCountry.click();
        Select dropdown = new Select(changeCountryRegion.countries);
        dropdown.selectByVisibleText(country);
    }
}
