package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {

    public ResultPage(){
        PageFactory.initElements(utilities.Driver.getDriver(),this);
    }

    @FindBy (xpath = "//div[@class='top-offer-container']")
    public WebElement topOffer;
}
