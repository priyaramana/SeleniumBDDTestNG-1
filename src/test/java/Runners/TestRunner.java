package Runners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "hooks"},
        plugin = {
            "pretty",
            "html:reports/cucumber.html",
            "json:reports/cucumber.json"
        },
        monochrome = true,
        publish = true
)


public class TestRunner extends AbstractTestNGCucumberTests {

}
