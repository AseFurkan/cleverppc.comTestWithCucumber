package StepDefinitions;

import Pages.HeaderContainer;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _02_LoginSteps {
    HeaderContainer hd = new HeaderContainer();
    @When("Navigate to Website")
    public void navigateToWebsite() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }
    @Then("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        hd.myClick(hd.signIn);
        hd.email.sendKeys("testTeam7@gmail.com");
        hd.password.sendKeys("team7");
        hd.signInButton.click();

    }

    @And("User should login successfully")
    public void userShouldLoginSuccessfully() {
        Assert.assertTrue(hd.myAccount.isEnabled(), "Başarıyla giriş yapılamadı");
    }

}
