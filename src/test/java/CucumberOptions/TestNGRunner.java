package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features/Homepage.feature",glue="Stepdefinations", monochrome=true)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
