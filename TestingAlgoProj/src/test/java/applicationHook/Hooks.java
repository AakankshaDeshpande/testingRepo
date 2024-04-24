package applicationHook;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;



public class Hooks  {

	private static WebDriver driver;
	private BasePage base;
	private Properties p;
	private Scenario sce;
	
	
	  public Hooks (BasePage base) throws IOException { 
		 this.base = base;
		
	  }
	 
     
		@Before(order = 0)
		public void setup(Scenario scenario ) throws IOException {
			this.sce = scenario;
			

			if (driver == null) {
				driver = base.initilizeBrowser();
				p = base.getProperties();
				
				base.InitializePageObject(driver, sce);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			}

	}
	public static WebDriver getDriver()
	{
		return driver;
	}
	

	
	
			
	  @AfterStep 
	  public void tearDown(Scenario scenario) {
	  
	  // this is for cucumber junit report 
		/*
		 * if(scenario.isFailed()) {
		 * 
		 * TakesScreenshot ts=(TakesScreenshot) base.getDriver(); byte[]
		 * screenshot=ts.getScreenshotAs(OutputType.BYTES); //
		 * scenario.attach(screenshot,"image/png",scenario.getName()); }
		 * 
		 * 
		 * 
		 * public void browserQuit() { webDriver.close();
		 */
	  }
	  
	 
    }
	 
   
