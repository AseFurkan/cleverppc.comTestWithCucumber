package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.*;
import java.util.ArrayList;

public class _06_AddProductControlSteps {
    CenterContainer cd = new CenterContainer();


    @Then("Add {string} random items to cart")
    public void addRandomItemsToCart(String sayiStr) {
        int sayi = Integer.parseInt(sayiStr);

        Random random = new Random();
        List<WebElement> selectedElements = new ArrayList<>();
        List<WebElement> selectedAddToCarts = new ArrayList<>();
        List<String> selectedProductName = new ArrayList<>();


        while (selectedElements.size() < sayi) {
            int randomIndex = random.nextInt(cd.quickView.size());
            WebElement selectedElement = cd.quickView.get(randomIndex);
            WebElement selectedAddToCart = cd.addToCart.get(randomIndex);
            if (!selectedElements.contains(selectedElement)) {
                selectedElements.add(selectedElement);
                selectedAddToCarts.add(selectedAddToCart);
                selectedProductName.add(selectedElement.getText());
            }
        }


        for (int i = 0; i < selectedElements.size(); i++) {
            bekle(2);
            cd.scrollToElement(selectedElements.get(i));
            cd.hoverOver(selectedElements.get(i));
            selectedAddToCarts.get(i).click();
            cd.myClick(cd.continueBtn);
        }

        cd.myClick(cd.cartBtn);

        int sayac = 0;
        for (WebElement element : cd.checkoutProductName) {
            if (selectedProductName.contains(element.getText())) {
                sayac++;
            }
        }
        Assert.assertTrue(selectedProductName.size() == sayac, "Yanlış ürün eklendi");

    }

    @And("Verify that the products are in the cart")
    public void verifyThatTheProductsAreInTheCart() {
        int toplam = 0;

        for (int i = 0; i < cd.quantity.size(); i++) {
            toplam += Integer.parseInt(cd.quantity.get(i).getAttribute("value"));
        }
        Assert.assertTrue(toplam == 3, "Eklenen ürün adeti sepetteki ile uyuşmamaktadır.");
    }

    public void bekle(int sn) {
        try {
            Thread.sleep(sn * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
