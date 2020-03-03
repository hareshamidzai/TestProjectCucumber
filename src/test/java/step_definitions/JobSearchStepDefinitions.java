package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.GDJobSearchPage;
import utilities.BrowserUtils;
import utilities.Driver;

import javax.swing.*;
import java.util.List;

public class JobSearchStepDefinitions {
        GDJobSearchPage gdJobSearchPage = new GDJobSearchPage();

    @Given("^The user is on the GD Jobs Search Page$")
    public void theUserIsOnTheGDJobsSearchPage()  {
        System.out.println("User is on GD Home Page");
        System.out.println(Driver.getDriver().getTitle());

    }

    @When("^The user fill the form$")
    public void theUserFillTheForm()  {
       System.out.println("User Fill The Form");


       gdJobSearchPage.titleBox.sendKeys("Automation Test engineer");
        BrowserUtils.waitFor(2);
        Actions action = new Actions(Driver.getDriver()) ;
        action.sendKeys(Keys.PAGE_DOWN).perform();
        gdJobSearchPage.CareersTapLink.sendKeys("Automation Test engineer");
       BrowserUtils.waitFor(2);
       System.out.println("Check all tabs are clickable");
       GDJobSearchPage.ClickAllTabs();
       gdJobSearchPage.missionSystemCheckbox.click();
       gdJobSearchPage.searchBoxButton.click();
       System.out.println("User Search for Job");
       BrowserUtils.waitFor(2);







    }


    @Then("^The Correct results should be displayed$")
    public void theCorrectResultsShouldBeDisplayed() throws Throwable {
        String actual = Driver.getDriver().getTitle();

        System.out.println("Verify User is on correct Web Page");
        System.out.println(actual);
        BrowserUtils.waitFor(2);
    }



}
