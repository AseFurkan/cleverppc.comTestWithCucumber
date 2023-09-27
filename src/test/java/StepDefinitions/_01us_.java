package StepDefinitions;

import Pages.CenterColumn;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class _01us_ {


    CenterColumn ct=new CenterColumn();
    @Given("I am on the homepage")
    public void iAmOnTheHomepage()
    {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("I click on Sign in button")
    public void iClickOnSignInButton()
    {
        ct.myClick(ct.login);
        ct.mySendKeys(ct.loginEmail,"test-7@gmail.com"+ Keys.ENTER);
        ct.myClick(ct.loginGender);
        ct.mySendKeys(ct.customerfirstname,"togi");
        ct.mySendKeys(ct.customerlastname,"brown");
        ct.mySendKeys(ct.passwd,"newyork123");
        Select day=new Select(ct.birthdays);
        Select month=new Select(ct.months);
        Select years=new Select(ct.years);
        day.selectByValue("8");
        month.selectByValue("4");
        years.selectByValue("1990");
        ct.myClick(ct.register);

    }

    @Then("i should see Create an Account section")
    public void iShouldSeeCreateAnAccountSection() {
    }
}
