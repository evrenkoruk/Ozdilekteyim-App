package com.ozdilekteyim.Pages;

import com.ozdilekteyim.helper.DriverHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.ozdilekteyim.contants.FindElementByConstant.SPLASH_PAGE_ID;


public class RunAppPage {

    private AppiumDriver<MobileElement> driver;
    public RunAppPage(AppiumDriver<MobileElement> appiumDriver){
        this.driver=appiumDriver;
    }



    public boolean isRun()  {
        WebElement splashElement= driver.findElement(By.id(SPLASH_PAGE_ID));
        return splashElement.isDisplayed();
    }
}
