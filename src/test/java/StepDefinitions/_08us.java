package StepDefinitions;


import Pages.HeaderContainer;
import Utilities.GWD;
import io.cucumber.java.en.*;

public class _08us {
HeaderContainer hd=new HeaderContainer();


    @When("Navigate to Website")
    public void navigateToWebsite() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }


    @Then("Click contactUs button")
    public void clickContactUsButton() {
      hd.myClick(hd.contactUs);
    }
}
