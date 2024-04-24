package stepDefinitions;


import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class HomeStep {
	private final WebDriver driver;
	private final BasePage base;
	Scenario sce;

	public HomeStep(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
		
	}
	
	@Given("The user should be able to open the browser")
	public void the_user_should_be_able_to_open_the_browser() throws IOException {
		base.getLogger().info("The user should be able to open the browser.. ");
		//base.InitializePageObject(driver, sce);
	}

	@When("the user enters ds algo portal {string}")
	public void the_user_enters_ds_algo_portal(String string) {
		base.getLogger().info("the user enters ds algo porta.. ");
		driver.get(string);
	   
	}

	@Then("^the user should landed on the DS_Algo Get Started page with message \"([^\"]*)\"$")
	public void the_user_should_landed_on_the_ds_algo_get_started_page_with_message(String string)  {
		try{
			
			base.getLogger().info("the user should landed on the DS_Algo Get Started page with message.. ");
			String act_text = driver.findElement(By.xpath("//p[normalize-space()='You are at the right place']")).getText();
			if(act_text.equalsIgnoreCase(string))
			{
				Assert.assertTrue(true);
			}else {
			
				Assert.assertTrue(false);
			}
		
	} catch (Exception e) {
		
		Assert.assertTrue(false);
	}
	}
}
