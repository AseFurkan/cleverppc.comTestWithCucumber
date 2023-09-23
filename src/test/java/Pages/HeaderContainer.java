package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class HeaderContainer {
    public HeaderContainer() {
        PageFactory.initElements(GWD.getDriver(), this);

    }
}
