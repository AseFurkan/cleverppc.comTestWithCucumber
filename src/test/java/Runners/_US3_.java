package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_US3_.feature"},
        glue = {"StepDefinitions"}

)

public class _US3_ extends AbstractTestNGCucumberTests {
}