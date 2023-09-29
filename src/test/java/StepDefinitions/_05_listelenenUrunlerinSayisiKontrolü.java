package StepDefinitions;

import Pages.CenterContainer_SayfaninOrtasi;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.security.krb5.SCDynamicStoreConfig;
import sun.util.resources.CalendarData;

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

        int text2=cd.productsCount2.getText().lastIndexOf(" items");
        String  count=cd.productsCount2.getText().substring(text2-1,text2);



        Assert.assertTrue(Integer.parseInt(count)==5,"Yanlış ürün adeti mesajı geliyor");




    }


    @And("Kullanıcı, listede yer alan ürünleri sayarak Satır sayısı, Resim  doğrulamalıdır")
    public void kullanıcıListedeYerAlanÜrünleriSayarakSatırSayısıResimDoğrulamalıdır() {
        Assert.assertTrue(cd.images.size()==5,"Sıralanan ürün adeti yanlıştır.");
    }
}
