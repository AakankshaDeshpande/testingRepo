
package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetStartStep {

	Scenario sce;
	private final BasePage base;
	Properties p;
	private final WebDriver driver;
	//VerificationPage verify;

	public GetStartStep(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;

	}

	// Main page background code

	@Given("the user is on the dsportalapp main page")
	public void the_user_is_on_the_dsportalapp_main_page() throws IOException {
		base.getLogger().info("the_user_is_on_the_dsportalapp_main_page.. ");
		//base.InitializePageObject(driver, sce);
		p = base.getProperties();
		driver.get(p.getProperty("appURL"));
		
	}

	@When("the user clicks on the Get Started button")
	public void the_user_clicks_on_the_get_started_button() {
		base.getLogger().info("the user clicks on the Get Started button");
		driver.findElement(By.xpath("//button[normalize-space()='Get Started']")).click();

	}

	@Then("the user navigates to the dsportalapp home page")
	public void the_user_navigates_to_the_dsportalapp_home_page() {
		
		base.getLogger().info("To check user is on Home page");
		try {

			String act_url = driver.getCurrentUrl();
			String exp_url = "https://dsportalapp.herokuapp.com/home";
			if (act_url.equalsIgnoreCase(exp_url)) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}

		} catch (Exception e) {

			Assert.assertTrue(false);
		}
	}

}
