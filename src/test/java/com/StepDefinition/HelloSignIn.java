package com.StepDefinition;

import com.Pages.MainPage;
import com.Utilities.BrowserUtilities;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class HelloSignIn {

    MainPage mainPage=new MainPage();
    @When("User click HelloSignIn module and navigate sign in page")
    public void userClickHelloSignInModuleAndNavigateSignInPage() {
        BrowserUtilities.highlight(mainPage.helloSignIn);
        mainPage.helloSignIn.click();

    }
}
