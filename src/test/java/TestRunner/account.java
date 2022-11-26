package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(	features = {"D:\\Automationframework\\src\\test\\java\\features\\Createaccount.feature"}, 
						glue = {"stepDefinition"}, 
						monochrome = true,
						dryRun = false,
						publish = true)
	public class account extends AbstractTestNGCucumberTests 
	{
		
	}
