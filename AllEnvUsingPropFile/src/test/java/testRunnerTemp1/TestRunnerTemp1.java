package testRunnerTemp1;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"./src/test/resources/FeatureFiles"},
		glue= {"stepDefiTemp1"},
	//	tags= "@Staging",
		plugin= {"pretty"}
		


		)
public class TestRunnerTemp1 {

}
