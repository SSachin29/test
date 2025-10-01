package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features/Homepage.feature",glue="Stepdefinations", monochrome=true,pliugin={"pretty,html:classname/targate.html"} )

public class TestNGRunner extends AbstractTestNGCucumberTests {

}
