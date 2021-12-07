package com.ozdilekteyim;

import com.ozdilekteyim.Logging.CustomLogger;
import com.ozdilekteyim.Pages.LoginPage;
import com.thoughtworks.gauge.Step;

public class LoginSteps extends DriverFactory{
    LoginPage page=new LoginPage(appiumDriver);
    @Step("Sayfanin acildigi kontrol edildi.")
    public void isPageOpened(){
        page.checkPage();
        CustomLogger.info("Giris ekrani acildi.");
    }
    @Step("Kullanıcı adı alanı dolduruldu.")
    public void isMailFilled(){
        page.fillMailInput();
        CustomLogger.info("Mail inputu girildi.");
    }
    @Step("Sifre alanı dolduruldu.")
    public void isPasswordFilled(){
        page.fillPasswordInput();
        CustomLogger.info("Sifre inputu girildi.");

    }
    @Step("Bir sayfa geri gidildi.")
    public void isBackClicked(){
        page.clickBack();
        CustomLogger.info("Bir sayfa geri gidildi.");
    }
}
