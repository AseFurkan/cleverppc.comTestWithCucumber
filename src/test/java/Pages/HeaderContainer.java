package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderContainer extends Parent{

    public HeaderContainer() {
        PageFactory.initElements(GWD.getDriver(), this);


    }

















        @FindBy(id = "contact-link")
        public WebElement contactUs;



}
