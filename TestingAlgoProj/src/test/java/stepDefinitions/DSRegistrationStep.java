package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DSRegistration;
import pageObjects.verifyUtil;
import utilities.ElementsUtils;

public class DSRegistrationStep extends BasePage{
	 private final BasePage base;
		Scenario sce;
	  
	     verifyUtil vp;
	     public ElementsUtils element;
	     DSRegistration registrationpage;
	    

		 public DSRegistrationStep(BasePage base) 
		  { 
			  this.driver = Hooks.getDriver(); 
			  this.base = base;
			  registrationpage = new DSRegistration(driver);
			  element= base.getElements();
			  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  }
			
		

		// RegistrationPage registrationPage;
		@Given("The user opens Register Page")
		public void the_user_opens_register_page() throws IOException {
			 base.getLogger().info("Initialize Page object");
			//base.InitializePageObject(driver, sce);
			p=base.getProperties();
			driver.get(p.getProperty("appURLRegistration"));
			 base.getLogger().info("Clicked on Registration Link");
	    	
	    	
		}

		@When("^The user fill in the registration form with given data (.*), (.*), and (.*)$")
		public void the_user_fill_in_the_RegistrationFormWithInvalidData(String username1, String password,
				String confirmpwd1) {

			base.getLogger().info("The user fill in the registration form with given data");
			base.getElements().typeTextIntoElement(registrationpage.username,username1,0);

			base.getElements().typeTextIntoElement(registrationpage.pwd ,password,0);
			base.getElements().typeTextIntoElement(registrationpage.confpwd,confirmpwd1,0);
			
	        base.getLogger().info("Clicked on Registration Button");
	        base.getElements().clickOnElement(registrationpage.btnRegister,0);

			

		}

		@Then("^User should see an error\\/success message(.*),(.*)$")
		public void user_should_see_an_error_success_message(String message, String status) {
			base.getLogger().info("Check for error message or popup message...");
			
			//vp= new verifyUtil(driver);
			
			try {
				boolean targetpage = base.getVerifyObj().isRunEditorValid(message);
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
