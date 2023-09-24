package StepDefinitions;
import Pages.CenterContainer_SayfaninOrtasi;
import Pages.HeaderContainer_SayfaninUstu;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _08_ {
    HeaderContainer_SayfaninUstu hd = new HeaderContainer_SayfaninUstu();
    CenterContainer_SayfaninOrtasi cd=new CenterContainer_SayfaninOrtasi();

    @When("Navigate to Website")
    public void navigateToWebsite() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @Then("Click contactUs button")
    public void clickContactUsButton() {
        hd.myClick(hd.contactUs);
    }

    @Then("Select Subject Heading")
    public void selectSubjectHeading() {
        makingSelectionByIndex(cd.subjectHeading, 2);
    }

    @And("Enter e-mail as {string} in the input")
    public void enterEMailAsInTheInput(String email) {
        cd.mySendKeys(cd.email, email);
    }

    @And("Enter order reference  as {string}")
    public void enterOrderReferenceAs(String orderReference) {
        cd.mySendKeys(cd.orderReference, orderReference);
    }

    @When("Upload image")
    public void uploadImage() throws AWTException {
        Actions actions = new Actions(GWD.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
        bekle(5);

        Robot robot = new Robot();
        StringSelection dosyaYolu = new StringSelection("C:\\Users\\pc\\Desktop\\BAGLARS\\Resimlerim\\20230624_202601.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        bekle(1);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        bekle(1);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        bekle(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        bekle(1);


    }

    @And("Enter the sentence {string} in the message box")
    public void enterTheSentenceInTheMessageBox(String message) {
        cd.mySendKeys(cd.message, message);
    }

    @Then("Click Send button")
    public void clickSendButton() {
        cd.myClick(cd.send);
        bekle(5);
    }

    public void makingSelectionByIndex(WebElement element, int sayi) {
        Select menu = new Select(element);
        menu.selectByIndex(sayi);
    }

    public void bekle(int sn) {
        try {
            Thread.sleep(sn * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        cd.verifyContainsText(cd.success, "Your message has been successfully sent to our team");
    }
}
