package tests;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import pageObject.SignUpPage;

public class SignUpTest extends BaseTest{
    @Before
    public void setUp(){
        driver.get("https://buyme.co.il/");
        driver.manage().window().maximize();
    }

    @Test
    public void ErrorMessageCheckEmailField_Test_01(){
        myTests = extent.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
        myTests.log(LogStatus.PASS, "Log from threadId: " + Thread.currentThread().getId());
        signUpPage.clickRegisterButton();
        signUpPage.clicksignIn();
        signUpPage.writeTextFirstNameField("zah");
        signUpPage.writeTextEmailField("zahamoyal12@gmail.com");
        signUpPage.writeTextPasswordField("Aa12345");
        signUpPage.writeTextPassword_Authentication("Aa12345");


    }
    /*
    @Test
    public void ErrorMessagePasswordField_Test_02(){
        myTests = extent.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
        myTests.log(LogStatus.PASS, "Log from threadId: " + Thread.currentThread().getId());
    }
     */
    @After
    public void afterTest(){
        extent.endTest(myTests);
    }

}
