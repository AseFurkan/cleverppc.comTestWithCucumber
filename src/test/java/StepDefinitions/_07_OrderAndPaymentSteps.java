package StepDefinitions;

import Pages.CenterContainer;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class _07_OrderAndPaymentSteps {
    SoftAssert _softAssert = new SoftAssert();

    CenterContainer cd = new CenterContainer();

    @When("Click to Cart")
    public void clickToCart() {
        cd.hoverOver(cd.cartBtn);
    }


    @Then("Click Checkout and select adress")
    public void clickCheckoutAndSelectAdress() {
        cd.myClick(cd.checkOut);
        cd.myClick(cd.proceedToCheckout);
        _softAssert.assertTrue(cd.adressControlText.getText().contains("Team yedi"), "Yanlış adres eklenmiş");
        cd.myClick(cd.proceedToCheckout2);
    }

    @And("Select shipment method and click agree button")
    public void selectShipmentMethodAndClickAgreeButton() {
        _softAssert.assertTrue(cd.shipmentMethod.isSelected(), "Method seçili gelmedi");
        _softAssert.assertAll();
        cd.myClick(cd.iAgree);
        cd.myClick(cd.processCarrier);
    }

    @Then("Click paypal and navigate to back when see warming")
    public void clickPaypalAndNavigateToBackWhenSeeWarming() {

        cd.myClick(cd.paypal);
        Assert.assertTrue(cd.unSuccessMessage.getText().contains(" Lütfen daha sonra tekrar deneyin"));
        GWD.getDriver().navigate().back();

    }

    @Then("Click credit card and navigate to back when see warming")
    public void clickCreditCardAndNavigateToBackWhenSeeWarming() {
        cd.myClick(cd.creditcart);
        Assert.assertTrue(cd.creditcartwarming.getText().contains("Invalid request"));
        GWD.getDriver().navigate().back();
    }

    @And("Click bank wire and camparing price")
    public void clickPayByBankWire() {
        String str1 = cd.totalPrice.getText();
        cd.myClick(cd.PayBankWire);
        String str2 = cd.amount.getText();
        Assert.assertEquals(str1, str2, "Değerler birbiri ile tutuşmuyor ");

    }

    @Then("Click I confirm my order and successful")
    public void clickIConfirmMyOrder() {
        cd.myClick(cd.confirmbutton);
        _softAssert.assertTrue(cd.orderComplete.getText().contains("complete"), "Sipariş Tamamlanamadı");
    }


}
