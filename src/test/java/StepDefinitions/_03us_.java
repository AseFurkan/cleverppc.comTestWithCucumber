package StepDefinitions;

import Pages.CenterColumn;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03us_ {

    CenterColumn ct=new CenterColumn();
    @Given("Navigate to cleverppc")
    public void navigateToCleverppc()
    {

            GWD.getDriver().get("https://cleverppc.com/prestashop4/");
            ct.myClick(ct.login);
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton()
    {

        ct.mySendKeys(ct.Email, "team-7@gmail.com");
        ct.mySendKeys(ct.Password, "Teknostudy7");
        ct.myClick(ct.Sublogin);
    }

    @Then("Click to T shirt and Sitemap and My Addresses and New Addresses")
    public void clickToTShirtAndSitemapAndMyAddressesAndNewAddresses()
    {
        ct.myClick(ct.tshirts);
        ct.myClick(ct.productname);
        ct.myClick(ct.sitemap);

    }

    @When("Filled New Addresses the required fields")
    public void filledNewAddressesTheRequiredFields()
    {
        ct.myClick(ct.Myaddress);
        ct.myClick(ct.Addaddress);
        ct.mySendKeys(ct.company, "Team7 Ltd");
        ct.mySendKeys(ct.address1, "brown street");
        ct.mySendKeys(ct.address2, "long island");
        ct.mySendKeys(ct.city, "NewYork");
        ct.myClick(ct.state);
        ct.mySendKeys(ct.postcode, "12345");
        ct.mySendKeys(ct.phone, "+199999999");
        ct.mySendKeys(ct.mobphone, "+90087897");
        ct.mySendKeys(ct.alias, "Team7");
        ct.myClick(ct.subaddress);

    }

    @And("Add the New Addresses succesfully")
    public void addTheNewAddressesSuccesfully()
    {
    }
}
