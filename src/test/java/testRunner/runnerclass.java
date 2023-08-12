package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Features/shop_Item.feature"},
        glue = {"stepDef"},
        plugin = {"pretty","html:target/cucumber-report/homepage.html"},
        monochrome = false,
        dryRun = false)
public class runnerclass extends AbstractTestNGCucumberTests {

}
