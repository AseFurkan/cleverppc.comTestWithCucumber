package StepDefinitions;

import Utilities.GWD;

public class Hooks {

    @After
    public void after(Scenario senaryo)
    {
        if (senaryo.isFailed()){
            TakesScreenshot ts=((TakesScreenshot) GWD.getDriver());
            byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }
        GWD.quitDriver();
    }

}
