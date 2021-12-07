package com.ozdilekteyim.helper;

import com.ozdilekteyim.DriverFactory;

import java.util.concurrent.TimeUnit;
public class DriverHelper extends DriverFactory {

    public static void waitSeconds(int second) {
        appiumDriver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
    }
}
