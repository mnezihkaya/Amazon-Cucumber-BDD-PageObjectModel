package com.Utilities;

import com.Pages.MainPage;
import org.junit.Test;

public class AmazonMainPageUtilities {

    //get all subtitles from menu
    MainPage mainPage=new MainPage();
    @Test
    public void all() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        BrowserUtilities.highlight(mainPage.allNavLeft);
        mainPage.all_rightModule.click();
        BrowserUtilities.sleep(10);
        mainPage.compressedSeeALLUnderShopByDepartment.click();
        BrowserUtilities.sleep(10);
        mainPage.compressedSeeALLUnderProgramAndFeatures.click();
        System.out.println(MainPage.AllSubtitlesMenuNumberReturnListOfSubTitle(2));

    }
    @Test
    public void all1() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        BrowserUtilities.highlight(mainPage.allNavLeft);
        mainPage.all_rightModule.click();
        MainPage.DigitalContentSubmoduleName("Amazon Music").click();
        System.out.println(MainPage.AllSubtitlesMenuNumberReturnListOfSubTitle(3));

    }

}
