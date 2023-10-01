package StepDefinitions;

import Pages.*;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.security.Key;

public class _03_CreateAddress {
    FooterContainer fc=new FooterContainer();
    CenterContainer cd=new CenterContainer();
    @And("SiteMape tıklayıp adreesse tıkla")
    public void sitemapeTıklayıpAdreesseTıkla() {
        fc.myClick(fc.siteMap);
        cd.myClick(cd.adresses);
        cd.myClick(cd.addAnAddress);
    }

    @Then("Adresi bilgilerini gir")
    public void adresiBilgileriniGir() {
        cd.mySendKeys(cd.company,"technoStudy");
        new Actions(GWD.getDriver()).sendKeys(Keys.TAB)
                .sendKeys("YelDeğirmeni mahallesi"+Keys.TAB)
                .sendKeys("Kadıköy"+Keys.TAB)
                .sendKeys("İstanbul"+Keys.TAB)
                .build().perform();
        cd.makingSelectionByIndex(cd.state,8);
        cd.mySendKeys(cd.zip,"00001");
        cd.mySendKeys(cd.phone,"02122145636");
        new Actions(GWD.getDriver()).sendKeys(Keys.TAB)
                .sendKeys("05320123456"+Keys.TAB)
                .sendKeys("Tester Mekanı"+Keys.TAB)
                .sendKeys("My Adress"+Keys.TAB)
                .build().perform();
        cd.myClick(cd.saveBtn);
    }

    @And("adres  kaydeddildi mi dogrula")
    public void adresKaydeddildiMiDogrula() {
        String text=cd.adressText.getText();
        Assert.assertTrue(text.contains("Your addresses are listed below."), "Adress kaydedilemedi");
    }


}
