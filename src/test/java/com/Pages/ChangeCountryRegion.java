package com.Pages;

import com.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeCountryRegion {

    public ChangeCountryRegion(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class=\"a-dropdown-container\"]")
    public WebElement SelectYourPreferredCountry;

    @FindBy(xpath = "//select[@id=\"icp-dropdown\"]")
    public WebElement countries;



}
