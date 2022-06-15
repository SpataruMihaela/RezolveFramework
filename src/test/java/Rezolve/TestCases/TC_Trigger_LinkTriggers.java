package Rezolve.TestCases;

import Rezolve.PageObjects.LinkPage;
import Rezolve.PageObjects.SignInPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Trigger_LinkTriggers extends BaseClass{
    @BeforeMethod
    public void signIn() throws InterruptedException {
        //*Login menthod*

        //Open URL
        driver.get(baseURL);
        //Create object of SignIn page object
        SignInPage sip = new SignInPage(driver);
        Thread.sleep(5000);

        //Click Sign In button to redirect user to login page
        sip.clickSigninbtn();

        //Add email
        sip.setEmailAddress(emailaddress);

        //Add password
        sip.setPassword(password);

        //Click continue button to login
        sip.clickbutton();
        Thread.sleep(8000);

    }

    @Test
    public void createEngagement() throws InterruptedException {
        LinkPage lp=new LinkPage(driver);

        //Click Link Trigger
        lp.clkLink();
        Thread.sleep(8000);

        //Click Choose a target page button
        lp.clkTargetPage();
        Thread.sleep(8000);

        //Click an Associated Engagements
        lp.chooseEngagements();
        Thread.sleep(8000);

        //Click Confirm and publish button
        lp.clickConfirm();
        Thread.sleep(8000);

        //Add an engagement name
        lp.enterName(engagement);
        Thread.sleep(8000);

        //Create the engagement
        lp.clickCreate();



    }
}
