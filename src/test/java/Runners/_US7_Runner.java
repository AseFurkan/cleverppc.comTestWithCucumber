package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = "@Products and @Checkout and @Payment and @Smoke and @Regression",
        features = {"src/test/java/FeatureFiles/_US4_.feature"},
        glue={"StepDefinitions"})

public class _US7_Runner extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("User Name", "Yaşar Oral");
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Application Name", "cleverppc");


    }
}