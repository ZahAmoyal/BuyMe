package tests;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObject.BasePage;
import pageObject.SignUpPage;
import pageObject.LoginPage;


public class BaseTest {
    public static WebDriver driver = null;
    static ExtentReports extent;
    static ExtentTest myTests;
    static String reportFilePath ="C:\\selenium-java-4.8.0\\date\\FinalProject.html";
    static BasePage basePage ;
    static LoginPage loginPage;
    static SignUpPage signUpPage;
    static LoginTest loginTest;
    static SignUpTest signUpTest;
    static String chromeD="C:/selenium-java-4.8.0/chromedriver_win32.1/chromedriver.exe";

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver",chromeD);
        driver =new ChromeDriver();
        extent = new ExtentReports(reportFilePath);
        myTests = extent.startTest("ExtentFinalProject");
        loginTest = new LoginTest();
        signUpTest = new SignUpTest();
        signUpPage = new SignUpPage(driver);
        basePage =new BasePage(driver);
        loginPage = new LoginPage(driver);
    }


    @AfterClass
    public static void closeDriver() throws InterruptedException {
        Thread.sleep(20000);
        driver.close();
        driver.quit();
        extent.flush();
    }

}













