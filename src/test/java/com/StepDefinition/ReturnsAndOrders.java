package com.StepDefinition;

import com.Pages.MainPage;
import com.Utilities.BrowserUtilities;
import io.cucumber.java.en.When;

public class ReturnsAndOrders {
    MainPage mainPage=new MainPage();

    @When("User click ReturnsAndOrders and navigate sign in page")
    public void userClickReturnsAndOrdersAndNavigateSignInPage() {
        BrowserUtilities.highlight(mainPage.returnsAndOrders);
        mainPage.returnsAndOrders.click();
    }
}
