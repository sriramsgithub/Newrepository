package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/sriramsn/eclipse-workspace/RapidTest/Features/RapidTest.feature",
		glue="StepDef",
		plugin = { "pretty","html:target/cucumber-reports" }
		)

public class RunnerClass {

}
