package com.StepDefinition;

import com.Pages.MainPage;
import com.Utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AllSubTitleCheck {
    MainPage mainPage = new MainPage();


    @When("User click all_rightSubmodule")
    public void userClickAll_rightSubmodule() {
        BrowserUtilities.highlight(mainPage.allNavLeft);
        mainPage.all_rightModule.click();
    }

    List<String> actualModules;

    @And("User should see {int} menu submodules")
    public void userShouldSeeMenuSubmodules(int SubMenuNumber) {
        actualModules = MainPage.AllSubtitlesMenuNumberReturnListOfTitle(SubMenuNumber);
    }

    @Then("verify menu submodules")
    public void verifyMenuSubmodules(List<String> expectedSubmodules) {
        Assert.assertEquals(actualModules, expectedSubmodules);
    }

    @And("user should click {string}")
    public void userShouldClick(String submodule) {
        MainPage.DigitalContentSubmoduleName(submodule).click();
    }
}
