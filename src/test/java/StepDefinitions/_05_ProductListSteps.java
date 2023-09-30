package StepDefinitions;

import Pages.CenterContainer;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class _05_ProductListSteps {
    CenterContainer cd = new CenterContainer();

    @Then("Check for a message at the top of the page for products count")
    public void checkForAMessageAtTheTopOfThePageForProductsCount() {
        Assert.assertTrue(cd.productsCount.isDisplayed(), "Sayfanın üstünde ürün sayısı bilgisi bulunmamaktadır. ");

    }

    @And("Make sure the X in the expression is {string}.")
    public void makeSureTheXInTheExpressionIs(String sayi) {
        String text = cd.productsCount.getText().replaceAll("[^0-9]", "");

        Assert.assertTrue(text.equals(sayi), "Lislenenen ürün sayısı " + sayi + "  değildir.");
    }

    @And("Check for a message at the bottom of the page for products count")
    public void checkForAMessageAtTheBottomOfThePageForProductsCount() {
        cd.scrollToElement(cd.productsCount2);
        Assert.assertTrue(cd.productsCount2.isDisplayed(), "Sayfanın altında ürün sayısı bilgisi bulunmamaktadır. ");


    }

    @Then("Verify there is {string} at the bottom")
    public void verifyThereIsAtTheBottom(String sayi) {
        int countInt = Integer.parseInt(sayi);

        cd.scrollToElement(cd.productsCount2);
        int text2 = cd.productsCount2.getText().lastIndexOf(" items");
        String count = cd.productsCount2.getText().substring(text2 - 1, text2);

        Assert.assertTrue(Integer.parseInt(count) == countInt, "Lislenenen ürün sayısı " + sayi + "  değildir.");

    }

    @And("Count the number of products on the page and verify there are {string} products")
    public void countTheNumberOfProductsOnThePageAndVerifyThereAreProducts(String sayi) {
        int countInt = Integer.parseInt(sayi);
        Assert.assertTrue(cd.images.size()==countInt,"Sıralanan ürün adeti yanlıştır.");
    }
}
