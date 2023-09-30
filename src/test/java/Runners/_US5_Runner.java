package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = " @Products and @Regression",
        features = {"src/test/java/FeatureFiles/_US4_.feature"},
        glue={"StepDefinitions"})

public class _US5_Runner extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("User Name", "Mustafa YumruTepe");
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Application Name", "cleverppc");


    }
}