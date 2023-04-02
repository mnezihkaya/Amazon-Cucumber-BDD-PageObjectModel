package com.StepDefinition;

import com.Pages.MainPage;
import com.Utilities.BrowserUtilities;
import io.cucumber.java.en.When;

public class CustomerService {
    MainPage mainPage=new MainPage();

    @When("User click {string}")
    public void userClick(String module) {
        MainPage.ChooseAndCLickMainPageModule(module);
    }
}
