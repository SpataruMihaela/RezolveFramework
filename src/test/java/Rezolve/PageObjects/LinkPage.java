package Rezolve.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkPage {
    WebDriver ldriver;

    public LinkPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//body/app-root[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-engagement-creation[1]/div[1]/div[1]/app-triggers[1]/div[1]/app-base-card-container[1]/div[1]/div[1]/app-base-card[5]/div[1]")
    @CacheLookup
    WebElement clickLink;

    @FindBy(xpath = "//span[contains(text(),'Choose a Target Page')]")
    @CacheLookup
    WebElement clickTargetBtn;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/span[1]")
    @CacheLookup
    WebElement clickEngagements;

    @FindBy(xpath = "//span[contains(text(),'Confirm and Publish')]")
    @CacheLookup
    WebElement confirmBtn;

    @FindBy(xpath = "//body/app-root[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-engagement-creation[1]/div[1]/div[1]/app-confirm-engagement[1]/app-creation-container[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[1]/input[1]")
    @CacheLookup
    WebElement txtName;

    @FindBy(xpath = "//span[contains(text(),'Create Engagement')]")
    @CacheLookup
    WebElement createEngagement;

    public void clkLink()
    {
        clickLink.click();
    }

    public void clkTargetPage()
    {
        clickTargetBtn.click();
    }

    public void chooseEngagements()
    {
        clickEngagements.click();
    }

    public void clickConfirm()
    {
        confirmBtn.click();
    }

    public void enterName(String engagementName)
    {
        txtName.sendKeys(engagementName);
    }

    public void clickCreate()
    {
        createEngagement.click();
    }
}
