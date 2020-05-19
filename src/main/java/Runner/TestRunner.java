package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/Ravi/Desktop/Selenium/BDDCucumberFramework/src/main/java/Features/taggedhooks.feature" //path of the feature files
		,glue = {"stepDefinitions"} // path of the stepDefinition files
		,format = {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit-xml/cucumber.xml"}// To generate different types of reporting
		,monochrome = true // To display the output proper readable format
		,strict = true // It will check if step is not defined in stepDefinition file
		,dryRun =false // To check mapping is proper between feature files and stepDefinition files
		,tags= {"~@SmokeTest , @RegressionTest, @End2End"}
		
		)


// OR: tags= {"@SmokeTest , @RegressionTest"} -- Execute all the tests tagged as @SmokeTest OR @RegressionTest

// AND: tags= {"@SmokeTest", "@RegressionTest"} -- Execute all the tests combination of @SmokeTest AND @RegressionTest

// ~: tags= {"~@SmokeTest} --- Ignoring the test





public class TestRunner {
	
	

}
