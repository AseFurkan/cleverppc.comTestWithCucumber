package StepDefinitions;

import Pages.CenterContainer_SayfaninOrtasi;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class _05_listelenenUrunlerinSayisiKontrolü {
    CenterContainer_SayfaninOrtasi cd=new CenterContainer_SayfaninOrtasi();




    @And("Kullanıcı, oluşan listenin üst kısımda yer alan Dresses There are X products. ifadesindeki X'in {string} olduğunu doğrulamalıdır.")
    public void kullanıcıOluşanListeninÜstKısımdaYerAlanDressesThereAreXProductsIfadesindekiXInOlduğunuDoğrulamalıdır(String sayi) {
        String text=cd.productsCount.getText().replaceAll("[^0-9]","");

        Assert.assertTrue(text.equals(sayi),"Lislenenen ürün sayısı "+sayi+"  değildir.");
    }


    @And("Kullanıcı, oluşan listenin alt kısımda yer alan  X'in {string} olduğunu doğrulamalıdır.")
    public void kullanıcıOluşanListeninAltKısımdaYerAlanXInOlduğunuDoğrulamalıdır(String sayi) {

        cd.scrollToElement(cd.productsCount2);
        String text2=cd.productsCount2.getText().replaceAll("[ items]","");

        System.out.println(text2);
                //Showing 1 - 5 of 5 items


    }
}
