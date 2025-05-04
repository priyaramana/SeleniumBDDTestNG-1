package Runners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "Hooks"},
        plugin = {
            "pretty",
            "html:reports/cucumber.html",
            "json:reports/cucumber.json",
            "\"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\""
        },
        monochrome = true,
        publish = true
)


public class TestRunner extends AbstractTestNGCucumberTests {

}
