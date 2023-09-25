package StepDefinitions;

import Pages.HeaderContainer;
import Pages.HeaderContainer_SayfaninUstu;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class _06us {
    HeaderContainer_SayfaninUstu hd = new HeaderContainer_SayfaninUstu();


    @Then("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        hd.myClick(hd.signIn);
        hd.email.sendKeys("testTeam7@gmail.com");
        hd.password.sendKeys("team7");
        hd.signInButton.click();

    }

    @And("User should login successfully")
    public void userShouldLoginSuccessfully() {

        Assert.assertTrue(hd.myAccount.isEnabled(),"Başarıyla giriş yapılamadı");
    }

    @And("Click to dresses")
    public void clickToDresses() {
        hd.myClick(hd.dress);
    }

    @Then("Select a dress and continue shopping")
    public void selectADressAndContinueShopping() {
    }

    @And("Select another dress and continue shopping")
    public void selectAnotherDressAndContinueShopping() {
    }

    @And("Select another last dress")
    public void selectAnotherLastDress() {
    }

    @When("Check shopping cart")
    public void checkShoppingCart() {
    }
}
