package StepDefinitions;

import Pages.*;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class _03_CreateAdressSteps {
    FooterContainer fc = new FooterContainer();
    CenterContainer cd = new CenterContainer();

    @And("Click on the Sitemap")
    public void ClickOnTheSitemap() {
        fc.myClick(fc.siteMap);
    }

    @And("Click on the Address")
    public void clickOnTheAddress() {
        cd.myClick(cd.adresses);
    }

    @And("Click on the Add A New Adres button")
    public void clickOnTheAddANewAdresButton() {
        cd.myClick(cd.addAnAddress);
    }

    @And("Filling in mandatory information")
    public void fillingInMandatoryInformation() {
        String addressName = RandomStringUtils.randomAlphanumeric(6);

        cd.mySendKeys(cd.company, "technoStudy");
        new Actions(GWD.getDriver()).sendKeys(Keys.TAB)
                .sendKeys("YelDeğirmeni mahallesi" + Keys.TAB)
                .sendKeys("Kadıköy" + Keys.TAB)
                .sendKeys("İstanbul" + Keys.TAB)
                .build().perform();
        cd.makingSelectionByIndex(cd.state, 8);
        cd.mySendKeys(cd.zip, "00001");
        cd.mySendKeys(cd.phone, "02122145636");
        new Actions(GWD.getDriver()).sendKeys(Keys.TAB)
                .sendKeys("05320123456" + Keys.TAB)
                .sendKeys("Tester Mekanı" + Keys.TAB)
                .build().perform();
        cd.mySendKeys(cd.myAddress,addressName);

        cd.myClick(cd.saveBtn);

    }

    @Then("Address should be added successfully")
    public void addressShouldBeAddedSuccessfully() {
        String text = cd.adressText.getText();
        Assert.assertTrue(text.contains("Your addresses are listed below."), "Adress kaydedilemedi");
    }
}
