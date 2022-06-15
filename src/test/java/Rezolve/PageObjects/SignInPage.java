package Rezolve.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    WebDriver ldriver;

    public SignInPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(name = "username")
    @CacheLookup
    WebElement txtEmailAddress;

    @FindBy(name = "password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(name = "action")
    @CacheLookup
    WebElement clickContinue;

    @FindBy(className = "sign-in")
    @CacheLookup
    WebElement clickSignIn;

    public void clickSigninbtn()
    {
        clickSignIn.click();
    }

    public void setEmailAddress(String eaddress)
    {
        txtEmailAddress.sendKeys(eaddress);
    }

    public void setPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void clickbutton()
    {
        clickContinue.click();
    }

    }

