package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		
	features = "src/test/java/features",
		//features = "classpath:features",
		glue = "stepdefination",
		tags = {"@sprint1,@sprit2,@AmazonTest"}
	)



	

public class newRunner extends AbstractTestNGCucumberTests {
	

}
