package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

public class GDJobSearchPage {
    public GDJobSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//input[@id='edit-title']")
    public WebElement titleBox;

    @FindBy(xpath = "//input[@id='edit-combine']")
    public WebElement CareersTapLink;

    @FindBy(xpath = "//input[@id='edit-job-code']")
    public WebElement LocationTab;

    @FindBy(xpath = "(//input[@type='checkbox'])[7]")
    public WebElement missionSystemCheckbox;

    @FindBy(xpath = "(//input[@class='default'])[1]")
    public WebElement JobCategory;

    @FindBy(xpath = "//input[@id='edit-submit-career-search']")
    public WebElement searchBoxButton;

    @FindBy(linkText = "There are no results that match your search parameters.")
    public WebElement message;


    public static void ClickAllTabs(){

        List<WebElement> Tabs=
       Driver.getDriver().findElements(By.xpath("//input[@type='checkbox']")) ;

        for(WebElement clickTabs : Tabs){
            clickTabs.click();


        } BrowserUtils.waitFor(2);

        for(WebElement clickTabs2 : Tabs){
            clickTabs2.click();

        } BrowserUtils.waitFor(2);


    }



}
