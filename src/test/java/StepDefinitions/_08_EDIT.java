package StepDefinitions;

import Pages.CenterContainer_SayfaninOrtasi;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import java.util.*;


public class _08_EDIT {
    CenterContainer_SayfaninOrtasi cd = new CenterContainer_SayfaninOrtasi();


    @Then("kullanici rastgele urun secsin")
    public void kullaniciRastgeleUrunSecsin() {
        Random random = new Random();
        List<WebElement> selectedElements = new ArrayList<>();
        List<WebElement> selectedAddToCarts = new ArrayList<>();

        List<String> selectedProductName=new ArrayList<>();
        while (selectedElements.size() < 3) {
            int randomIndex = random.nextInt(cd.quickView.size());
            WebElement selectedElement = cd.quickView.get(randomIndex);
            WebElement selectedAddToCart = cd.addToCart.get(randomIndex);
            if (!selectedElements.contains(selectedElement)) {
                selectedElements.add(selectedElement);
                selectedAddToCarts.add(selectedAddToCart);
                selectedProductName.add(selectedElement.getText());
            }
        }


        for (int i = 0; i <selectedElements.size() ; i++) {
            bekle(2);
            cd.scrollToElement(selectedElements.get(i));
            cd.hoverOver(selectedElements.get(i));
            selectedAddToCarts.get(i).click();
            cd.myClick(cd.continueBtn);
        }

        cd.myClick(cd.cartBtn);

        int sayac=0;
        for (WebElement element:cd.checkoutProductName) {
            if (selectedProductName.contains(element.getText())){
                sayac++;
            }
        }
        Assert.assertTrue(sayac==3,"Yanlış ürün eklendi");

    }

    public void bekle(int sn) {
        try {
            Thread.sleep(sn * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("urunlerin sepette oldugunu dogrula")
    public void urunlerinSepetteOldugunuDogrula() {
        int toplam=0;

        for (int i = 0; i < cd.quantity.size(); i++) {
            toplam+=Integer.parseInt(cd.quantity.get(i).getAttribute("value"));
        }
        Assert.assertTrue(toplam==3,"EKLENEN ÜRÜN ADETİ YANLIŞTIR.");

    }
}
