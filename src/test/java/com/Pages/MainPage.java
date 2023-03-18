package com.Pages;

import com.Utilities.BrowserUtilities;
import com.Utilities.ConfigurationReader;
import com.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "nav-hamburger-menu")
    public WebElement allNavLeft;

    @FindBy(xpath = "//span[text()=\"Amazon Health\"]")
    public WebElement amazonHealth;

    @FindBy(id="twotabsearchtextbox")
    public  WebElement searchBox;

    @FindBy(xpath = "//input[@type=\"submit\"]")
    public WebElement submitButton;

    @FindBy(xpath = "//a[@class=\"nav-a  \"]")
    public List<WebElement> mainPageNavFill30Module;

    public static void ChooseAndCLickMainPageModule(String module) {
        WebElement element= Driver.getDriver().findElement(By.xpath("//span[text()=\"+module+\"]"));
        BrowserUtilities.highlight(element);
        element.click();
        BrowserUtilities.waitForPageToLoad(ConfigurationReader.getNumber("timeout"));
}



    }
