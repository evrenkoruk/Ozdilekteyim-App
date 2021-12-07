package com.ozdilekteyim.Pages;

import com.ozdilekteyim.helper.DriverHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static com.ozdilekteyim.contants.FindElementByConstant.*;

public class ProductPage {
    private AppiumDriver<MobileElement> driver;
    public ProductPage(AppiumDriver<MobileElement> appiumDriver){
        this.driver=appiumDriver;
    }

    public boolean checkPage(){
        DriverHelper.waitSeconds(5);
        WebElement checkFavIcon= driver.findElement(By.id(PRODUCT_PAGE_ID));
        return checkFavIcon.isDisplayed();
    }

    public void clickFav()  {
        WebElement favButton=driver.findElement(By.id(FAVORITE_BUTTON_ID));
        favButton.click();
        DriverHelper.waitSeconds(5);
    }

    public void addProductToBasket() throws InterruptedException {
        WebElement productSize=driver.findElement(By.xpath(PRODUCT_SIZE_XPATH));
        productSize.click();
        WebElement addBasketButton= driver.findElement(By.id(ADD_CART_BUTTON_ID));
        addBasketButton.click();
        TimeUnit.SECONDS.sleep(2);
        DriverHelper.waitSeconds(5);

    }

}
