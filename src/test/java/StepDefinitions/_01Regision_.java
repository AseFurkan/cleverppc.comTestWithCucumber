package StepDefinitions;

import Pages.CenterContainer;
import Utilities.GWD;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.*;

public class _01Regision_ {



    CenterContainer ct=new CenterContainer();
    @Given("I am on the homepage")
    public void iAmOnTheHomepage()
    {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("I click on Sign in button")
    public void iClickOnSignInButton()
    {
        ct.myClick(ct.login);
        ct.mySendKeys(ct.loginEmail,"test2-78@gmail.com"+ Keys.ENTER);
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
