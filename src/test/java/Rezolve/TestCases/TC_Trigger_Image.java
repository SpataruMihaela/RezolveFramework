package Rezolve.TestCases;

import Rezolve.PageObjects.ImagePage;
import Rezolve.PageObjects.SignInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class TC_Trigger_Image extends BaseClass {

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


    @Test(priority = 1)
    public void UploadImage() throws InterruptedException, AWTException {
        ImagePage ip = new ImagePage(driver);

        //Click image trigger
        ip.clkImage();
        Thread.sleep(8000);

        //Click browse an image button
        ip.imagepath();

        //Select the image
        Robot rb = new Robot();
        StringSelection str = new StringSelection("C:\\Users\\spata\\Desktop\\website.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        rb.setAutoDelay(2000);

        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        //Compare the expected title with the actual title of the page
        String expTitle = "Rezolve Create";
        Assert.assertEquals(expTitle, driver.getTitle());

        ip.clickTargetBtn();
    }

    }

