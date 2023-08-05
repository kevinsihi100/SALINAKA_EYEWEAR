package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {".//Features/signup.feature",".//Features/signIn.feature"},
        glue = {"stepDef"},
        plugin = {"pretty","html:target/cucumber-report/homepage.html"},
        monochrome = true,
        dryRun = false)
public class runnerclass extends AbstractTestNGCucumberTests {

}
