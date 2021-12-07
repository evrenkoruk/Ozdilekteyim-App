package com.ozdilekteyim.Pages;

import com.ozdilekteyim.helper.DriverHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.ozdilekteyim.contants.FindElementByConstant.*;

public class MainPage {
    private AppiumDriver<MobileElement> driver;
    public MainPage(AppiumDriver<MobileElement> appiumDriver){
        this.driver=appiumDriver;
    }

    public void checkLogo()  {
        DriverHelper.waitSeconds(7);
        WebElement topLogo= driver.findElement(By.id(HOME_PAGE_LOGO_ID));
        Assert.assertTrue(topLogo.isDisplayed());
    }

    public void clickMarketButton(){
        WebElement marketBtn=driver.findElement(By.id(MARKET_BUTTON_ID));
        marketBtn.click();
    }

    public void checkMarketPage(){
        DriverHelper.waitSeconds(7);
        WebElement bottomNav=driver.findElement(By.id(MARKET_PAGE_ID));
        Assert.assertTrue(bottomNav.isDisplayed());
    }

    public void clickCategoriesButton() {
        WebElement categoryBtn = driver.findElement(By.id(CATEGORY_BUTTON_ID));
        categoryBtn.click();
    }
}
