package com.ozdilekteyim.Pages;

import com.ozdilekteyim.helper.DriverHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static com.ozdilekteyim.contants.FindElementByConstant.*;

public class LoginPage {
    private AppiumDriver<MobileElement> driver;
    public LoginPage(AppiumDriver<MobileElement> appiumDriver){
        this.driver=appiumDriver;
    }

    public boolean checkPage(){
        DriverHelper.waitSeconds(5);
        WebElement checkButton=driver.findElement(By.id(LOGIN_BUTTON_ID));
        return checkButton.isDisplayed();
    }

    public void fillMailInput(){
        WebElement mailBox= driver.findElement(By.id(EMAIL_INPUT_ID));
        mailBox.sendKeys("evren");
    }

    public void fillPasswordInput(){
        WebElement mailBox= driver.findElement(By.id(PASSWORD_INPUT_ID));
        mailBox.sendKeys("koruk");
    }

    public void clickBack(){
        DriverHelper.waitSeconds(5);
        WebElement backBtn= driver.findElement(By.id(BACK_BUTTON_ID));
        backBtn.click();
    }

}
