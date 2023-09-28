package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    @CucumberOptions(
            tags = " @Cart and @Smoke and @Regression",
            features = {"src/test/java/FeatureFiles/_US4_.feature"},
            glue={"StepDefinitions"})

    public class _US4_ extends AbstractTestNGCucumberTests {
        }