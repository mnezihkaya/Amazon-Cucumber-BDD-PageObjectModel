package com.StepDefinition;

import com.Pages.MainPage;
import com.Utilities.BrowserUtilities;
import com.Utilities.Driver;
import io.cucumber.java.en.When;

public class MainPageMainModules {
    MainPage mainPage=new MainPage();

    @When("User click {string}")
    public void userClick(String mainModule) {
        MainPage.ChooseAndCLickMainPageModule(mainModule);

    }

}
