package StepDefinitions;

import Pages.CenterContainer_SayfaninOrtasi;
import Utilities.GWD;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class _07_SiparişVer {
    CenterContainer_SayfaninOrtasi cd = new CenterContainer_SayfaninOrtasi();

    @When("sepete git")
    public void sepeteGit() {
        SoftAssert _softAssert = new SoftAssert();
        cd.hoverOver(cd.cartBtn);
        cd.myClick(cd.checkOut);
        cd.myClick(cd.proceedToCheckout);
        _softAssert.assertTrue(cd.adressControlText.getText().contains("Team yedi"), "Yanlış adres eklenmiş");
        cd.myClick(cd.proceedToCheckout2);
        _softAssert.assertTrue(cd.shipmentMethod.isSelected(), "Method seçili gelmedi");
        _softAssert.assertAll();
        cd.myClick(cd.iAgree); //loc sıkıkntısı vardı tab kısmına gerek kalmadı
       // new Actions(GWD.getDriver()).click(cd.shipmentMethod).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).build().perform();
        cd.myClick(cd.proceedToCheckout3);
        cd.myClick(cd.paypal);

        Assert.assertTrue(cd.unSuccessMessage.getText().contains(" Lütfen daha sonra tekrar deneyin"));

        GWD.getDriver().navigate().back();


    }
}
