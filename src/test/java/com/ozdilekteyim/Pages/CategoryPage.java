package com.ozdilekteyim.Pages;

import com.ozdilekteyim.contants.FindElementByConstant;
import com.ozdilekteyim.helper.DriverHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import static com.ozdilekteyim.contants.FindElementByConstant.*;

public class CategoryPage {
    private AppiumDriver<MobileElement> driver;

    public CategoryPage(AppiumDriver<MobileElement> appiumDriver) {
        this.driver = appiumDriver;
    }

    public boolean checkCategoryPage() {
        DriverHelper.waitSeconds(7);
        WebElement tabLayout = driver.findElement(By.id(CHECK_CATEGORY_ID));
        return tabLayout.isDisplayed();
    }

    public void selectGender() {
        DriverHelper.waitSeconds(3);
        WebElement genderButton = driver.findElement(By.xpath(SELECT_GENDER_XPATH));
        genderButton.click();
    }

    public void selectProductCategory() {
        DriverHelper.waitSeconds(3);
        WebElement productCategory = driver.findElement(By.xpath(SELECT_PRODUCT_CATEGORY_XPATH));
        productCategory.click();
    }

    public void scrollPage() {
        DriverHelper.waitSeconds(5);
        PointOption pressStart = PointOption.point(543, 1970);
        PointOption pressEnd =  PointOption.point(543, 1);
        for (int i = 0; i < 2; i++) {
            scroll(pressStart, pressEnd);
        }
    }

    private void scroll(PointOption pressStart, PointOption pressEnd) {
        new TouchAction(driver)
                .press(pressStart)
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(100)))
                .moveTo(pressEnd)
                .release()
                .perform();
    }

    public void selectRandom() {
        int nth = ThreadLocalRandom.current().nextInt(1, 4);
        WebElement productElement = driver.findElement(By.xpath(PREFIX_SELECT_PRODUCT + nth +SUFFIX_SELECT_PRODUCT));
        productElement.click();
        DriverHelper.waitSeconds(5);
    }


}
