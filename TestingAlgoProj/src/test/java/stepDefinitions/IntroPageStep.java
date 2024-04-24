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
import pageObjects.verifyUtil;

	public class IntroPageStep {

	Scenario sce;
	private final BasePage base;
	Properties p;
	private final WebDriver driver;
	verifyUtil verify;

	public IntroPageStep(BasePage base) {
			this.driver = Hooks.getDriver();
			this.base = base;
		}

	@Given("the user is on the DS Introduction page")
	public void the_user_is_on_the_ds_introduction_page() throws IOException {
		base.getLogger().info("Initialize Page object .....");
		base.InitializePageObject(driver, sce);
		p = base.getProperties();
		base.getLogger().info("Open home page URL.....");
		driver.get(p.getProperty("appurlHome"));
	}

	@When("the user clicks on the DS Introduction Get Started button")
	public void the_user_clicks_on_DS_Introduction_link() {
		String locatorString = "(//a[@href='graph'])";
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		base.getLogger().info("Clicked on Get Started...");
		driver.findElement(By.xpath(locatorString)).click();
	}

	@When("the user clicks on the register link")
	public void the_user_clicks_on_the_register_link() {
		base.getLogger().info("Clicked on Registration Link....");
		base.getRegistrationObj().clickRegistrationLink();
	}

	@Then("the user should get error message {string}")
	public void the_user_should_get_error_message(String string) {
		base.getLogger().info("Error message : You are not logged in");
		boolean msg = base.getDsintroObj().Errormsg(string);
		try {

			if (msg == true) {
				Assert.assertTrue(true);

			} else {
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			Assert.assertTrue(false);
		}
	}

	@Then("The user should be redirected to {string}")
	public void the_user_should_should_be_redirected_to(String string) throws IOException {
		base.getLogger().info("Check Registration URL ....");
		p= base.getProperties();
		
		boolean urlcheck = base.hpc.urlVerify(p.getProperty("appURLRegistration"));
		try {

			if (urlcheck == true) {
				Assert.assertTrue(true);

			} else {
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			Assert.assertTrue(false);
		}

	}

	@When("the user clicks on data structure dropdown arrow")
	public void the_user_clicks_on_data_structure_dropdown_arrow() {
		base.getLogger().info("Clicked on Dropdown Data structure");
		base.getDsintroObj().clickDropDown();
	}

	@Then("The user should able to see six options Arrays Linked List Stack Queue Tree Graph in dropdown menu.")
	public void the_user_should_able_to_see_options_arrays_in_dropdown_menu() {
		base.getLogger().info("Check Dropdown list");
		boolean dropdownMatch = base.getDsintroObj().getDropMenu();
		if (dropdownMatch == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
