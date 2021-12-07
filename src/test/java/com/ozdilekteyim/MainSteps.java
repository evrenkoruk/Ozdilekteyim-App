package com.ozdilekteyim;

import com.ozdilekteyim.Logging.CustomLogger;
import com.ozdilekteyim.Pages.MainPage;
import com.thoughtworks.gauge.Step;

public class MainSteps extends DriverFactory{

    MainPage page=new MainPage(appiumDriver);
    @Step("Top Logo kontrol edildi.")
    public void isLogoDisplayed() throws InterruptedException {
        page.checkLogo();
        CustomLogger.info("Uygulamanin dogru sekilde acildigi kontrol edildi.");
    }

    @Step("Alisverise Basla butonuna tıklandı.")
    public void isMarketButtonSelected(){
        page.clickMarketButton();
        CustomLogger.info("Alisverise Basla butonuna tıklandı");
    }

    @Step("Alt navigasyon kontrolu saglandi ve sayfa acildi.")
    public void isMarketOpened(){
        page.checkMarketPage();
        CustomLogger.info("Sayfa acilmasi kontrol edildi.");
    }
    @Step("Kategori butonuna tıklandı.")
    public void isCategorySelected(){
        page.clickCategoriesButton();
        CustomLogger.info("Kategori sekmesine girildi.");
    }
}
