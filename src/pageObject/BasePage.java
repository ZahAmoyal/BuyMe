package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    //Click Method
    public void click(By elementLocation){
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).click();
    }

    // write Text
    public void writeText(By elementLocation, String text) {
        waitVisibility(elementLocation);
        WebElement field =driver.findElement(elementLocation);
        field.clear();
        field.sendKeys(text);
    }

    // Is selected
    public boolean selected(By elementLocation) {
        waitVisibility(elementLocation);
        return driver.findElement(elementLocation).isSelected();
    }
    // Is displayed
    public boolean displayed( By elementLocation){
        waitVisibility(elementLocation);
        return driver.findElement(elementLocation).isDisplayed();
    }
    //Get Text
    public String getText (By elementLocation){
        waitVisibility(elementLocation);
        return driver.findElement(elementLocation).getText();
    }
    public void waitVisibility(By by) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void selectUnitValue(By elementLocation , String unit) throws InterruptedException {
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(elementLocation).click();
    }
}

