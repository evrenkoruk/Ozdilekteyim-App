package com.ozdilekteyim;

import com.ozdilekteyim.Logging.CustomLogger;
import com.ozdilekteyim.Pages.RunAppPage;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class RunAppPageSteps extends DriverFactory {

    RunAppPage page = new RunAppPage(appiumDriver);

    @Step("Uygulamanin acildigi kontrol edildi.")
    public void isAppOpened(){
        Assert.assertTrue(page.isRun());
        CustomLogger.startLog("Uygulama basladi. Uygulama ekrani geldi.");
    }
}