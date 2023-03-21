package com.StepDefinition;

import com.Pages.MainPage;
import com.Utilities.BrowserUtilities;
import com.Utilities.ConfigurationReader;
import com.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;


public class AllModuleSubtitles {
    MainPage mainPage = new MainPage();
    List<String> actualModules;

    @And("user should see the all menu {int} subtitles of submodules")
    public void userShouldSeeTheAllMenuSubtitlesOfSubmodules(int SubMenuNumber) {
        actualModules = MainPage.AllSubtitlesMenuNumberReturnListOfSubTitle(SubMenuNumber);
    }

    @Then("verify menu subtitles expectedSubmodules")
    public void verifyMenuSubtitlesExpectedSubmodules(List<String> expectedSubmodules) {
        Assert.assertEquals(expectedSubmodules,actualModules);
    }
    /*
    @Test
    public void all() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        BrowserUtilities.highlight(mainPage.allNavLeft);
        mainPage.all_rightModule.click();
        BrowserUtilities.sleep(10);
        mainPage.compressedSeeALLUnderShopByDepartment.click();
        BrowserUtilities.sleep(10);
        mainPage.compressedSeeALLUnderProgramAndFeatures.click();


        System.out.println(MainPage.AllSubtitlesMenuNumberReturnListOfSubTitle(1));

    }

*/
}

