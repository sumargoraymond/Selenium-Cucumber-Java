package cucumber.testkumparan.java.testNG.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features/login",
        glue = {"cucumber.testkumparan.java.testNG.stepDefinitions"},
        format = {"pretty",
                "html:target/cucumber-report/chrome",
                "json:target/cucumber-report/chrome/cucumber.json",
                "junit:target/cucumber-report/chrome/cucumber.xml"})
public class RunnerLoginFeatures extends AbstractTestNGCucumberTests {
}