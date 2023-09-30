package StepDefinitions;

import Pages.CenterContainer;
import Pages.HeaderContainer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class _06_Furkan {
    ArrayList<WebElement> element = new ArrayList<>();
    HeaderContainer hd = new HeaderContainer();
    CenterContainer cs = new CenterContainer();

    @And("Click to dresses")
    public void clickToDresses() {
        hd.myClick(hd.dress);
    }

    @Then("Select a dress and continue shopping")
    public void selectADressAndContinueShopping() {
        element.add(cs.allDresses1);
        cs.myClick(cs.continueShop);
    }

    @And("Select another dress and continue shopping")
    public void selectAnotherDressAndContinueShopping() {
        cs.myClick(cs.continueShop);


    }

    @And("Select another last dress")
    public void selectAnotherLastDress() {
        cs.myClick(cs.shoppingCart);
        System.out.println("deneme");

    }

    @When("Check shopping cart")
    public void checkShoppingCart() {
    }
}
