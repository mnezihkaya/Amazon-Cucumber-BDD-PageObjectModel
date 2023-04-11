package com.StepDefinition;

import com.Pages.MainPage;
import com.Utilities.BrowserUtilities;
import io.cucumber.java.en.When;

public class CartButton {
    MainPage mainPage=new MainPage();
    @When("user should click cart button")
    public void userShouldClickCartButton() {
        BrowserUtilities.highlight(mainPage.cart);
        mainPage.cart.click();
    }
    
}
