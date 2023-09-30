package StepDefinitions;
import Pages.CenterContainer;
import Pages.HeaderContainer;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _08_ContactUsSteps {
    HeaderContainer hd = new HeaderContainer();
    CenterContainer cd=new CenterContainer();



    @Then("Click contactUs button")
    public void clickContactUsButton() {
        hd.myClick(hd.contactUs);
    }

    @Then("Select Subject Heading")
    public void selectSubjectHeading() {
        cd.makingSelectionByIndex(cd.subjectHeading,1);
    }
    @And("Select Order Reference")
    public void selectOrderReference() {
        cd.makingSelectionByIndex(cd.orderReference,1);
    }
    @And("Select Product")
    public void selectProduct() {
        cd.makingSelectionByIndex(cd.productSelect,1);
    }

    @When("Upload image")
    public void uploadImage() throws AWTException {
        Actions actions = new Actions(GWD.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();


        Robot robot = new Robot();
        StringSelection dosyaYolu = new StringSelection("C:\\Users\\pc\\Desktop\\BAGLARS\\Resimlerim\\20230624_202601.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        cd.bekle(1);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        cd.bekle(1);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        cd.bekle(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        cd.bekle(1);


    }

    @And("Enter the sentence {string} in the message box")
    public void enterTheSentenceInTheMessageBox(String message) {
        cd.mySendKeys(cd.message, message);
    }

    @Then("Click Send button")
    public void clickSendButton() {
        cd.myClick(cd.send);
        cd.bekle(5);
    }





    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        cd.verifyContainsText(cd.success, "Your message has been successfully sent to our team");
    }



}
