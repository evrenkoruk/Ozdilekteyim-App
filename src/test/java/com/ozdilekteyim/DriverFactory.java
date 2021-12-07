package com.ozdilekteyim;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverFactory {

    protected static AppiumDriver<MobileElement> appiumDriver;
    protected static FluentWait<AppiumDriver<MobileElement>> fluentWait;
    private boolean isAndroid=true;
    private static String APP_PACKAGE="com.ozdilek.ozdilekteyim";
    private static String APP_ACTIVITY="com.ozdilek.ozdilekteyim.MainActivity";
    private static String DEVICE_NAME="emulator-5554";
    private static String URL="http://127.0.0.1:4723/wd/hub";
    @BeforeScenario
    public void setUp() throws MalformedURLException {
        if(isAndroid){
            System.out.println("Android OS test started.");
            DesiredCapabilities capabilities=new DesiredCapabilities();
            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,APP_PACKAGE);
            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,APP_ACTIVITY);
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,DEVICE_NAME);
            capabilities.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);

            capabilities.setCapability(AndroidMobileCapabilityType.DEVICE_READY_TIMEOUT,10);
            URL url=new URL(URL);
            appiumDriver=new AndroidDriver<>(url,capabilities);
        }else {
            System.out.println("iOS test started.");
        }
        fluentWait=new FluentWait<>(appiumDriver);
        fluentWait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(450)).ignoring(NoSuchElementException.class);
    }
    @AfterScenario
    public void tearDown(){
        if(appiumDriver!=null){
            appiumDriver.quit();
        }else{
            System.out.println("Driver is null");
        }

    }

}
