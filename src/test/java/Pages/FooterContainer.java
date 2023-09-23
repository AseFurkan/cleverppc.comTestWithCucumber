package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class FooterContainer {
    public FooterContainer() {
        PageFactory.initElements(GWD.getDriver(), this);

    }
}
