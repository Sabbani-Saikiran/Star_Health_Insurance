package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sai\\eclipse-workspace\\Cucumber-Workspace\\StarHealth\\src\\test\\java\\features\\StarHealth.feature",
				glue= {"steps"},
				plugin= {"html:target/Cucumberreport.html",
						"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"timeline:test-output-thread/"		
})

public class StarHealthTestRunner {
	
}
