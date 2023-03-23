package com.Pages;

import com.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChangeCountryRegion {

    public ChangeCountryRegion(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class=\"a-dropdown-container\"]")
    public WebElement SelectYourPreferredCountry;

    @FindBy(xpath = "//select[@id=\"icp-dropdown\"]")
    public List<WebElement> countries;

    @FindBy(xpath = "//select[@id=\"icp-dropdown\"]")
    public WebElement country;

    @FindBy(xpath = "//span[@class=\"a-dropdown-prompt\"]")
    public WebElement chosenCountry;



}
