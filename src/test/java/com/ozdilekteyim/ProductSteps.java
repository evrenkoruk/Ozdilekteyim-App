package com.ozdilekteyim;

import com.ozdilekteyim.Logging.CustomLogger;
import com.ozdilekteyim.Pages.ProductPage;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ProductSteps extends DriverFactory{

    ProductPage page=new ProductPage(appiumDriver);
    @Step("Urun sayfasi kontrol edildi.")
    public void isPageOpened(){
        CustomLogger.info("Urun detay sayfasi acildi.");
        Assert.assertTrue(page.checkPage());
    }
    @Step("Urun favoriye eklendi.")
    public void isFavAdded() throws InterruptedException {
        page.clickFav();
        CustomLogger.info("Urun favoriye eklendi.");
    }
    @Step("Urun sepete eklendi.")
    public void isProductAddedToBasket() throws InterruptedException {
        page.addProductToBasket();
        CustomLogger.info("Urun sepete eklendi");
        CustomLogger.endLog("Senaryo tamamlandı.");
    }
}
