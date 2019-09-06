package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

        //POM (Page Object Model design pattern
        //All the WebElements for each particular page on the site would be stored in organized matter for easy maintenance and updates.
public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='close']")
    public WebElement signInPageClose;

    @FindBy(xpath = "//div[@class='location-search-container ng-pristine ng-valid ng-valid-editable']")
    public WebElement hotelSearch;
    @FindBy(xpath = "(//li[@class='uib-typeahead-match ng-scope'])[1]")
    public WebElement hotelDropdown;
    @FindBy(xpath = "//input[@name='programAutosuggest']")
    public WebElement programSearch;
    @FindBy(xpath = "(//a[@class='ng-binding ng-scope'])[1]")
    public WebElement programDropdown;
    @FindBy(xpath = "//div[@class='checkin booking-date']")
    public WebElement startDate;
    @FindBy(xpath = "(//a[@class='ui-state-default'])[6]")
    public WebElement startDateDropdown;
    @FindBy(xpath = "//div[@class='checkout booking-date']")
    public WebElement endDate;
    @FindBy(xpath = "(//a[@class='ui-state-default'])[1]")
    public WebElement endDateDropdown;

    @FindBy(xpath = "(//button[@class='btn dropdown-toggle form-control'])[2]")
    public WebElement guest;

    @FindBy(xpath = "((//ul[@class='dropdown-menu'])[4]/li)[3]/a")
    public WebElement guestDropdown;


    @FindBy(xpath = "(//button[@class='btn dropdown-toggle form-control'])[3]")
    public WebElement room;
    @FindBy(xpath = "((//ul[@class='dropdown-menu'])[5]/li)[1]")
    public WebElement roomDropdown;

    @FindBy(xpath = "//button[@class='rm-btn-orange search-submit-btn']")
    public WebElement searchAll;






}