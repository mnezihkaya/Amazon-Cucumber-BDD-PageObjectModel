package com.Pages;

import com.Utilities.BrowserUtilities;
import com.Utilities.ConfigurationReader;
import com.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //RightSide-All and its submodules

    @FindBy(xpath = "//div[@id=\"nav-main\"]//span[text()=\"All\"]")
    public WebElement all_rightModule;
    @FindBy(xpath = "//ul[@data-menu-id=\"1\"]//div[@class=\"hmenu-item hmenu-title \"]")
    public List<WebElement> all_rightModuleSubmodules_menu1_Title;

    /*
    @FindBy(xpath = "//ul[@data-menu-id=\"2\"]//div[@class=\"hmenu-item hmenu-title \"]")
    public List<WebElement> all_rightModuleSubmodulePrimeVideoSubmodule_Title;

    @FindBy(xpath = "//ul[@data-menu-id=\"3\"]//div[@class=\"hmenu-item hmenu-title \"]")
    public List<WebElement> all_rightModuleSubmoduleAmazonMusicSubmodule_Title;

    @FindBy(xpath = "//ul[@data-menu-id=\"4\"]//div[@class=\"hmenu-item hmenu-title \"]")
    public List<WebElement> all_rightModuleSubmoduleEchoAndAlexaSubmodule_Title;

    @FindBy(xpath = "//ul[@data-menu-id=\"5\"]//div[@class=\"hmenu-item hmenu-title \"]")
    public List<WebElement> all_rightModuleSubmoduleFireTabletsSubmodule_Title;

    @FindBy(xpath = "//ul[@data-menu-id=\"6\"]//div[@class=\"hmenu-item hmenu-title \"]")
    public List<WebElement> all_rightModuleSubmoduleFireTVSubmodule_Title;

    @FindBy(xpath = "//ul[@data-menu-id=\"7\"]//div[@class=\"hmenu-item hmenu-title \"]")
    public List<WebElement> all_rightModuleSubmoduleKindleE_ReadersAndBooksSubmodule_Title;

    @FindBy(xpath = "//ul[@data-menu-id=\"8\"]//div[@class=\"hmenu-item hmenu-title \"]")
    public List<WebElement> all_rightModuleSubmoduleKindleAudibleBooksAndOriginalsSubmodule_Title;

    @FindBy(xpath = "//ul[@data-menu-id=\"9\"]//div[@class=\"hmenu-item hmenu-title \"]")
    public List<WebElement> all_rightModuleSubmoduleAmazonPhotosSubmodule_Title;

    @FindBy(xpath = "//ul[@data-menu-id=\"10\"]//div[@class=\"hmenu-item hmenu-title \"]")
    public List<WebElement> all_rightModuleSubmoduleAmazonAppStoreSubmodule_Title;
*/

    @FindBy(id = "nav-hamburger-menu")
    public WebElement allNavLeft;

    //search Box menu
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@type=\"submit\"]")
    public WebElement submitButton;

    //Main Page middle modules
    @FindBy(xpath = "//a[@class=\"nav-a  \"]")
    public List<WebElement> mainPageNavFill30Module;

    //Digital Content & Devices submodules

    public static WebElement DigitalContentSubmoduleName(String DigitalContentSubmoduleName) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//div[.=\"" + DigitalContentSubmoduleName + "\"]"));
        return element;
    }


    //
    public static void ChooseAndCLickMainPageModule(String module) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//span[text()=\"+module+\"]"));
        BrowserUtilities.highlight(element);
        element.click();
        BrowserUtilities.waitForPageToLoad(ConfigurationReader.getNumber("timeout"));
    }


    public static List<String> AllSubtitlesMenuNumberReturnListOfTitle(int menuNumber) {
        List<WebElement> ActualElements = Driver.getDriver().findElements(By.xpath("//ul[@data-menu-id=\"" + menuNumber + "\"]//div[@class=\"hmenu-item hmenu-title \"]"));

        List<String> ActualElementsString = new ArrayList<>();

        for (WebElement each : ActualElements) {
            BrowserUtilities.highlight(each);
            ActualElementsString.add(each.getText());
        }
        return ActualElementsString;

    }

}
