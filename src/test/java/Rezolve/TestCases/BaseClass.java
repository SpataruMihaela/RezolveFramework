package Rezolve.TestCases;

import Rezolve.PageObjects.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import java.util.concurrent.TimeUnit;

public class BaseClass {

    public String baseURL = "https://create.rezolve.com/engagement-creation";
    public String emailaddress = "spatarumihaela91@gmail.com";
    public String password = "Cibeles911";
    public String engagement= "First Assignment";
    public static WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void setup(String br) {
        if(br.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(br.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "//Drivers//geckodriver.exe" );
            driver=new FirefoxDriver();
        }
        driver.manage().window().maximize();

    }

    @AfterClass
    public void closeBrowser()
    {
        driver.quit();

  }

}

