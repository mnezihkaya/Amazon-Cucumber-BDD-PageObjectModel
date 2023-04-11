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
    @FindBy(xpath = "//a[@class=\"hmenu-item\"]")
    public List<WebElement> allRightModuleSubmodules458;
    @FindBy(xpath = "//ul[@data-menu-id=\"1\"]//a[@class=\"hmenu-item\"]")
    public List<WebElement> allFirstMenuSubmodule;
    @FindBy(xpath = "//a[@class=\"hmenu-item hmenu-compressed-btn\"]/div[.=\"see all\"][1]")
    public WebElement compressedSeeALLUnderShopByDepartment;
    @FindBy(xpath = "(//a[@class=\"hmenu-item hmenu-compressed-btn\"]//div[.=\"see all\"])[2]")
    public WebElement compressedSeeALLUnderProgramAndFeatures;


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

    //you are shopping on Amazon
    @FindBy(xpath = "//*[@id=\"nav-flyout-icp\"]/div[2]/span[2]/span/text()")
    public WebElement youAreShoppingOnMessage;
    @FindBy(xpath = "//span[.=\"Amazon.com\"]")
    public WebElement amazonComMessage;
    //Language option radio button
    @FindBy(xpath = "//span[.=\"español\"]")
    public WebElement LanguageEspanolRadioButton;

    @FindBy(xpath = "//span[.=\"English\"]")
    public WebElement LanguageEnglishRadioButton;

    public static void languageRadioButton(String language) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//span[.=\"" + language + "\"]"));
        BrowserUtilities.highlight(element);
        element.click();
    }

    @FindBy(id = "nav-hamburger-menu")
    public WebElement allNavLeft;
//cart on main page
    @FindBy(id="nav-cart-count-container") public WebElement cart;
    //search Box menu
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@id=\"nav-search-dropdown-card\"]/..")
    public WebElement allNextToSearchBox;

    @FindBy(xpath = "//select[@id=\"searchDropdownBox\"]")
    public WebElement allNextToSearchBoxDropDown;

    @FindBy(xpath = "//input[@type=\"submit\"]")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class=\"nav-search-submit nav-sprite\"]")
    public WebElement submitButtonColorChange;

    //Main Page middle modules
    @FindBy(xpath = "//a[@class=\"nav-a  \"]")
    public List<WebElement> mainPageNavFill30Module;

    //SelectYourAddress.feature
    @FindBy(xpath = "//*[@id=\"nav-global-location-popover-link\"]")
    public WebElement SelectYourAddress;

    @FindBy(xpath = "//*[@id=\"a-popover-header-1\"]")
    public WebElement chooseYourLocationPopUpHeadLine;

    @FindBy(xpath = "//input[@id=\"GLUXZipUpdateInput\"]")
    public WebElement chooseYourLocationEnterZipcodeArea;

    @FindBy(xpath = "//*[@id=\"GLUXZipUpdate\"]/span/input")
    public WebElement chooseYourLocationApplyButton;

    @FindBy(xpath = "//*[@id=\"GLUXZipConfirmationSection\"]/div/text()[2]")
    public WebElement confirmationValueOfZipcode;

    @FindBy(xpath = "//*[@id=\"GLUXChangePostalCodeLink\"]")
    public WebElement changeButton;

    //Language Module and Submodules
    @FindBy(xpath = "//a[@id=\"icp-nav-flyout\"]")
    public WebElement chooseLanguageForShopping;

    @FindBy(linkText = "Learn more")
    public WebElement learnMore;

    @FindBy(xpath = "//i[@class=\"icp-radio\"]")
    public WebElement radioButton;

    @FindBy(xpath = "//div[@class=\"icp-mkt-change-lnk\"]")
    public WebElement changeCountryRegion;

    //Returns and Orders
    @FindBy(id = "nav-orders") public WebElement returnsAndOrders;


    //Digital Content & Devices submodules
    public static WebElement DigitalContentSubmoduleName(String DigitalContentSubmoduleName) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//div[.=\"" + DigitalContentSubmoduleName + "\"]"));
        return element;
    }

    //main Menu
    public static void ChooseAndCLickMainPageModule(String module) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//div[@id=\"nav-xshop\"]//a[.=\"" + module + "\"]"));
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

    public static List<String> AllSubtitlesMenuNumberReturnListOfSubTitle(int menuNumber) {
        List<WebElement> ActualElements = Driver.getDriver().findElements(By.xpath("//ul[@data-menu-id=\"" + menuNumber + "\"]//a[@class=\"hmenu-item\"]"));

        List<String> ActualElementsString = new ArrayList<>();

        for (WebElement each : ActualElements) {
            BrowserUtilities.highlight(each);
            ActualElementsString.add(each.getText());
        }
        return ActualElementsString;

    }


}
