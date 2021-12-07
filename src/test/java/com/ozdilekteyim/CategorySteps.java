package com.ozdilekteyim;

import com.ozdilekteyim.Logging.CustomLogger;
import com.ozdilekteyim.Pages.CategoryPage;
import com.thoughtworks.gauge.Step;

public class CategorySteps extends DriverFactory{

    CategoryPage page=new CategoryPage(appiumDriver);
    @Step("Ust sekme kontrolu yapildi.")
    public void checkPageOpened(){
        page.checkCategoryPage();
        CustomLogger.info("Kategoril Ber sayfası açıldı.");
    }

    @Step("Kadin kategorisi butonuna tiklandi.")
    public void isGenderClicked(){
        page.selectGender();
        CustomLogger.info("Cinsiyet seçimi yapıldı");
    }
    @Step("Pantolon butonuna tiklandi.")
    public void isCategoryClicked(){
        page.selectProductCategory();
        CustomLogger.info("Kategori secimi yapildi.");

    }
    @Step("Sayfanin altina scroll edildi.")
    public void isScrollDown(){
        page.scrollPage();
        CustomLogger.info("Sayfa sonuna gidildi.");
    }
    @Step("Rastgele bir urun secildi.")
    public void isRandomProductSelected() {
        page.selectRandom();
        CustomLogger.info("Bir urun secildi.");
    }

}
