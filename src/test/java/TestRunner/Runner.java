package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(	features = {"src/test/java/features/login.feature"}, 
					glue = {"stepDefinition"}, 
					monochrome = true,
					dryRun = false,
					publish = true)

public class Runner extends AbstractTestNGCucumberTests {

}
