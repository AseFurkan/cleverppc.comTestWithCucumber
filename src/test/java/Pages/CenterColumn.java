package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class CenterColumn {
    public CenterColumn() {
        PageFactory.initElements(GWD.getDriver(), this);

    }
}
