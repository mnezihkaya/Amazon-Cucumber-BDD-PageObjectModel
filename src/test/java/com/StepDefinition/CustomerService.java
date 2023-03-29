package com.StepDefinition;

import com.Pages.MainPage;
import com.Utilities.BrowserUtilities;
import io.cucumber.java.en.When;

public class CustomerService {
    MainPage mainPage=new MainPage();
    @When("User click customerService")
    public void userClickCustomerService() {
        BrowserUtilities.highlight(mainPage.customerService);
        mainPage.customerService.click();
    }
}
