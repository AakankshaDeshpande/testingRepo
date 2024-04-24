package runnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				
					features= {".\\src\\test\\resources\\Feature\\StackFeature.feature"},
							
					glue={"stepDefinitions", "applicationHook"},
							//tags="@Feature1 and @Feature2",
					
					
					plugin= {"pretty", "html:reports/myreport.html", 
							  "rerun:target/rerun.txt",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
							},
					
							
					dryRun=false,    // checks mapping between scenario steps and step definition methods
					monochrome=true,    // to avoid junk characters in output
					publish=true   // to publish report in cucumber server
					
		)


public class runner {

}
