package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.verifyUtil;

public class helperClassStepDefi extends BasePage {
	Scenario sce;
	private final BasePage base;
	Properties p;
	private final WebDriver driver;
	verifyUtil verify;

	public helperClassStepDefi(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;

	}

	@Given("The user navigates to login page")
	public void the_user_navigates_to_login_page() throws IOException {
		  base.getLogger().info("the_user_navigates_to_login_page.. ");
		  base.InitializePageObject(driver, sce);
		  p=base.getProperties();
	      driver.get(p.getProperty("appURLlogin"));
		 
	}

	@When("the user gives username and password")
	public void the_user_gives_username_and_password() throws IOException {
		base.getLogger().info("Entering email and password.. ");
		p = base.getProperties();
		base.getLoginObj().sendUserName(p.getProperty("username").trim());
		base.getLoginObj().sendPwdName(p.getProperty("password").trim());
	}

	@Then("The user logsin")
	public void the_user_logsin() {
		base.getLogger().info("User Clicks on Login");
		base.getLoginObj().clickLogin();
	}

	@Given("User is on {string} page")
	public void user_is_on_page(String string) throws IOException {
		base.InitializePageObject(driver, sce);
		String act_url = driver.getCurrentUrl();
		String exp_url = "https://dsportalapp.herokuapp.com/home";
		Assert.assertEquals(exp_url, act_url);

	}

	@When("The user clicks on {string} get started button")
	public void the_user_clicks_on_get_started_button(String string) throws InterruptedException {
		base.getLogger().info("the_user_clicks_on_get_started_button");
		String locatorString = "(//a[@href='" + string + "'])[1]";
		driver.findElement(By.xpath(locatorString)).click();
	}

	
	@Then("The user will be directed to {string} Page")
	public void the_user_will_be_directed_to_page(String string) {
		base.getLogger().info("the_user_will_be_directed_to_page");
		String baseUrl = "https://dsportalapp.herokuapp.com/";
		String url = baseUrl.concat(string.toLowerCase() + "/"); // Concatenate base URL with section and slash
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(url,act_url);
	}
	

	
	
	

	
	@Then("The user clicks on Practice Questions link")
	public void the_user_clicks_on_to_the_practice_questions_link() throws InterruptedException {
		base.getLogger().info("the_user_clicks_on_to_the_practice_questions_link");
		base.getHpc().Practicequestions();
	}

	 @Then("The user will be directed to practice questions of the Page {string}")
	public void the_user_will_be_directed_to_practice_questions_of_page(String string) throws IOException {
		base.getLogger().info("the_user_will_be_directed_to_practice_questions_of_page");
		String baseUrl = "https://dsportalapp.herokuapp.com/";
		String url = baseUrl.concat(string.toLowerCase() + "/"+"practice"); // Concatenate base URL with section and slash
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(url,act_url);
	}
	 
	@And("The user clicks Try Here button on the page")
	public void the_user_clicks_try_here_button_on_the_page() throws InterruptedException {
		
		base.getLogger().info("the user clicks on the Try here button");
		base.getHpc().ClickTryHere();

	}

	@Then("The user will be redirected to tryEditor page with a Run button to test")
	public void the_user_will_be_redirected_to_try_editor_page_with_a_run_button_to_test() throws InterruptedException {
		base.getLogger().info("check for tryeditor page....");
		String act_url = driver.getCurrentUrl();
		String exp_url = "https://dsportalapp.herokuapp.com/tryEditor";
		Assert.assertEquals(exp_url,act_url);

	}

	
	@When("^The user enters (.*) in tryEditor and user clicks Run button$")
	public void the_user_enters_println_in_try_editor_and_user_clicks_run_button(String string) throws InterruptedException {
		base.getHpc().enterText(string);
		base.getLogger().info("the user clicks on the run button");
		base.getElements().clickOnElement(base.getHpc().runBtn,0);
	}
	
	
	@Given("The user is in {string} page")
	public void the_user_is_on_the_page(String string) throws IOException {
		
		base.getLogger().info("On the Start page");
		p = base.getProperties();
		base.InitializePageObject(driver, sce);
		String baseUrl = "https://dsportalapp.herokuapp.com/";
		String url = baseUrl.concat(string.toLowerCase() + "/"); // Concatenate base URL with section and slash
		driver.get(url);
	}
	
	@Given("The user is in TryEditor page")
	public void the_user_is_in_try_editor_page() throws IOException {
		base.InitializePageObject(driver, sce);
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	}

	@Then("^The user will be presented with the Run output (.*) (.*)$")
	public void the_user_will_be_presented_with_the_run_output(String text, String status)
			throws IOException, InterruptedException {
		base.getLogger().info("Python code is checked .....");
		verify = new verifyUtil(driver);
		try {
			boolean targetpage = verify.isRunEditorValid(text);
			
			if (status.equalsIgnoreCase("valid"))

			{
				if (targetpage == true) {

					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

			if (status.equalsIgnoreCase("Invalid")) {
				if (targetpage == true) {

					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

		} catch (Exception e) {

			Assert.assertTrue(false);
		}
	}
	
	

}
