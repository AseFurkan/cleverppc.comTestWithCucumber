package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.*;

public class _08us {
    @When("Navigate to Website")
    public void navigateToWebsite() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }


}
