package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;





@CucumberOptions(features = "src/test/java/FeartureFiles", glue = {
		"StepDefinations" }, monochrome = true)

public class TestNGRunner extends AbstractTestNGCucumberTests {
	

}
