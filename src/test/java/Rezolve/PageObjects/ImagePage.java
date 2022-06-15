package Rezolve.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImagePage {

    WebDriver ldriver;

    public ImagePage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(css = "body.mat-typography:nth-child(2) mat-sidenav-container.mat-drawer-container.mat-sidenav-container.sidenav-container mat-sidenav-content.mat-drawer-content.mat-sidenav-content.sidenav-content:nth-child(8) div.router-container:nth-child(2) app-engagement-creation.ng-star-inserted:nth-child(2) div.container.ng-star-inserted div.layout app-triggers.ng-star-inserted:nth-child(3) div.parent app-base-card-container:nth-child(1) div:nth-child(1) div.card-container app-base-card.base-card.ng-star-inserted:nth-child(2) > div.base-card-container.trigger_types")
    @CacheLookup
    WebElement clickImage;

    @FindBy(xpath = "//span[contains(text(),'Browse for images')]")
    @CacheLookup
    WebElement BrowseImages;

    @FindBy(xpath = "//span[contains(text(),'Browse for images')]")
    @CacheLookup
    WebElement imageSelected;

    @FindBy(xpath = "//body/app-root[1]/app-navbar[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-engagement-creation[1]/div[1]/div[1]/app-image-trigger[1]/app-creation-container[1]/div[1]/div[3]/div[1]/button[2]")
    @CacheLookup
    WebElement TargetPage;

    public void clkImage()
    {
        clickImage.click();
    }

    public void choseImagebtn()
    {
        BrowseImages.click();
    }

    public void imagepath()
    {
        imageSelected.click();
    }
    public void clickTargetBtn()
    {
        TargetPage.click();
    }

}
