package stepDefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SignIn;
import pageObjects.verifyUtil;
import utilities.DataReader;
import utilities.ElementsUtils;

public class SignInStep extends BasePage {
	verifyUtil vp;
	private final BasePage base;
	Scenario sce;
	public SignIn login;
	public ElementsUtils element;
	String status;
	String msg ;

	public SignInStep(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
		login = base.getLoginObj();
		element= base.getElements();
	}

	List<HashMap<String, String>> datamap; // Data driven

	@Given("the user navigates to login page") 
	public void user_navigate_to_login_page() throws IOException 
	{
		base.getLogger().info("Goto my account-->Click on Login.. ");
		base.InitializePageObject(driver, sce);
		p=base.getProperties();
		driver.get(p.getProperty("appURLlogin"));
		
	}
		
  
	
	
	@When("user enter username and password from excel row {string}")
    public void user_enter_username_and_password_from_excel_row(String rows) {
        base.getLogger().info("Entering email and password.. ");

        datamap = DataReader.data(System.getProperty("user.dir") + "\\testData\\ExcelData.xlsx"); // Assuming sheet name is the first sheet
        base.getLogger().info("The user fills in the Login form with given data");
        int index = Integer.parseInt(rows) - 1;

        // Handle potential issues with missing data or exceeding list bounds
        if (index >= 0 && index < datamap.size()) {
            HashMap<String, String> rowData = datamap.get(index);
            String uname = rowData.getOrDefault("username", "");
            String pwd = rowData.getOrDefault("password", "");
            status = rowData.getOrDefault("status", "");
            msg = rowData.getOrDefault("message", "");

            base.getElements().typeTextIntoElement(login.loginusername, uname, 0);
            base.getElements().typeTextIntoElement(login.loginpwd, pwd, 0);
            base.getElements().clickOnElement(base.getLoginObj().btnLogin, 0);

            base.getLogger().info("Clicked on login button...");
        } else {
            base.getLogger().error("Invalid row index provided: " + rows);
            // Optionally throw a custom exception or handle the error differently
        }
    }

    // ... other methods ...


	@Then("the user should be redirected to the home page")
	public void the_user_should_be_redirected_to_the_home_page() {
		
		  base.getLogger().info("The user is on home page");
			 // base.getLoginObj().clickLogin();
			
			try {
				boolean targetpage = base.getVerifyObj().isLoginPageExists(msg);
				System.out.println("target page: " + targetpage);
				if (status.equals("Valid")) {
					if (targetpage == true) {
						
						base.getVerifyObj().clickLogout();
						Assert.assertTrue(true);
					} else {
						Assert.assertTrue(false);
					}
				}

				if (status.equals("Invalid")) {
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