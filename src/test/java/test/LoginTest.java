package test;

import Utilities.Config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ResultPage;

public class LoginTest {
    WebDriver driver = utilities.Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    ResultPage resultPage = new ResultPage();

    @BeforeMethod
    public void quit(){

        driver.get(Config.getProperty("url"));

    }
    @AfterMethod
    public  void tearDown(){
        driver.quit();
    }
    @Test
    public void searchHotel() throws InterruptedException {
/*
*     TestCase == Scenario

 *   Feature: HomePage/search

 * Scenario #1: User Inputs All required information to sucessfuly reach to the end point (can make this dynamic for reusability for DDT)
 *   Given: User is on website (RocketMiles.com)
 *   When: User chooses location of the hotel
 *   And: User selects reward program
 *   And: User selects "check-in" date
 *   And: User selects "check-out" date
 *   And: User selects number of Guests
 *   And: User selects number of Rooms
 *   Then: User clicks on "Search properties and earn rewards"
 *
 *   Automated Scenario #1 is below
 * Using Thread.sleep only to show the flow on the webapp itself. It can be removed, not necessary and not usually in real work environment.
* */
        Thread.sleep(3000);
        loginPage.signInPageClose.click();
        Thread.sleep(1000);
        loginPage.hotelSearch.click();
        Thread.sleep(1000);
        loginPage.hotelDropdown.click();
        Thread.sleep(1000);
        loginPage.programSearch.click();
        Thread.sleep(1000);
        loginPage.programDropdown.click();
        Thread.sleep(1000);
        loginPage.startDate.click();
        Thread.sleep(1000);
        loginPage.startDateDropdown.click();
        Thread.sleep(1000);
        loginPage.endDate.click();
        Thread.sleep(1000);
        loginPage.endDateDropdown.click();
        Thread.sleep(1000);
        loginPage.guest.click();
        Thread.sleep(1000);
        loginPage.guestDropdown.click();
        Thread.sleep(1000);
        loginPage.room.click();
        Thread.sleep(1000);
        loginPage.roomDropdown.click();
        Thread.sleep(1000);
        loginPage.searchAll.click();

        //Loading takes some time, just to be on the safe side I added Explicit wait.
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(resultPage.topOffer));

        Assert.assertTrue(resultPage.topOffer.isDisplayed());


    }
/*
* Scenario #2: User Inputs location (can make this dynamic for reusability for DDT)
*   Given: User is on website (RocketMiles.com)
*   When: User clicks on input box "Where do you need a hotel?"
*   Then: Dropdown with "Top Destinations"  should appear
*
* Scenario #3: User Selects reward program (can make this dynamic for reusability)
*   Given: User is on website (RocketMiles.com)
*   When: User clicks on input box "Select reward program"
*   Then: Dropdown with "Popular programs" should appear
*
 * Scenario #4: User Selects Check-in date
 *   Given: User is on website (RocketMiles.com)
 *   When: User clicks on input box "Check-in" date
 *   Then: Dropdown with "Calendar "should appear
 *
 ** Scenario #3: User Selects Check-out date
 *   Given: User is on website (RocketMiles.com)
 *   When: User clicks on input box "Check-out"
 *   Then: Dropdown with "Calendar "should appear
 *
 *And so on...and on...and on
 *
 * When automating we can break it down or make cases larger (depends on the style preferred)
 *
 * */

}
