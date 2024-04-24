//
//package stepDefinitions;
//import java.io.IOException;
//import java.util.Properties;
//
//import org.openqa.selenium.By;
//
//import DriverFactory.BasePage;
//import applicationHook.Hooks;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.TryEditorPage;
//
//public class MystackStep extends BasePage {
//	
//	private final BasePage base;
//	Scenario sce;
//	Properties p;
//	private TryEditorPage tryEditorPage;
//
//	public MystackStep(BasePage base) {
//		this.driver = Hooks.getDriver();
//		this.base = base;
//	}
//	
//	 // Dependency injection for TryEditorPage
//
//    public MystackStep(TryEditorPage tryEditorPage) { // Constructor to inject TryEditorPage
//        this.base = new BasePage();
//		this.tryEditorPage = tryEditorPage;
//    }
//	
//	
//	@When("The user enters \"<data>\" in the TryEditor")
//    public void enterDataInTryEditor(String data) {
//        tryEditorPage.enterDataInTryEditor(data); // Use TryEditorPage method to clear and enter data
//    }
//
//    @When("The user clicks the Run button")
//    public void clickRunButton() {
//        tryEditorPage.clickRunButton();  // Use TryEditorPage method to click the Run button
//    }
//
////	// Login scenario steps
////    @Given("The user navigates to login page")
////    public void userIsOnLoginPage() {
////        // Implement logic to check if the user is on the login page (e.g., using page object model)
////    }
////
////    @When("The user enters a valid username \"<username>\" and password \"<password>\"")
////    public void userEntersValidCredentials(String username, String password) {
////        // Implement logic to enter valid username and password (e.g., using page object model)
////    }
////
////    @Then("The user is successfully logged in")
////    public void userIsLoggedIn() {
////        // Implement logic to verify successful login (e.g., checking for a specific element or text)
////    }
//    
//    
//    
//    
//    
//    @Given("The user navigates to login page")
//	public void the_user_navigates_to_login_page() throws IOException {
//	
//		  base.getLogger().info("the_user_navigates_to_login_page.. ");
//		  base.InitializePageObject(driver, sce);
//	      driver.get("https://dsportalapp.herokuapp.com/login");
//		 
//	}
//
//	@When("the user gives username and password")
//	public void the_user_gives_username_and_password() throws IOException {
//
//		base.getLogger().info("Entering email and password.. ");
//
//		p = base.getProperties();
//		base.getLoginObj().sendUserName(p.getProperty("username").trim());
//
//		base.getLoginObj().sendPwdName(p.getProperty("password").trim());
//
//	}
//
//	@Then("The user logsin")
//	public void the_user_logsin() {
//		base.getLogger().info("User Clicks on Login");
//		base.getLoginObj().clickLogin();
//
//	}    
//    
//    @When("The user is on \"<home>\" page")
//    public void userIsOnHomePage(String homePage) {
//        // Implement logic to verify the user is on the home page (e.g., check URL, title)
//    }
//   
//    @When("The user clicks on \"<section>\" Get Started button")
//    	  public void userClicksOnGetStartedButton(String section) {
//    	        tryEditorPage.clickGetStartedButton(section); // Delegate to TryEditorPage for button interaction
//    	    }
//    
//
//    @Then("The user will be directed to \"<section>\" Page")
//    public void userDirectedToSectionPage(String section) {
//        // Implement logic to verify the user is on the expected section page (e.g., check URL, title)
//    }
//
//    @When("The user clicks Try Here button")
//    public void userClicksTryHereButton() {
//        tryEditorPage.clickTryHereButton(); // Delegate to TryEditorPage for button interaction
//    }
//
//    @Then("The user will be redirected to TryEditor page with a Run button to test")
//    public void userRedirectedToTryEditorPage() {
//        // Implement logic to verify the user is on the TryEditor page and Run button is present
//    }
//
//    @When("The user enters \"<data>\" in the TryEditor")
//    public void userEntersDataInTryEditor1(String data) {
//        tryEditorPage.enterDataInTryEditor(data); // Use TryEditorPage method to clear and enter data
//    }
//
//    @When("The user clicks the Run button")
//    public void userClicksRunButton1() {
//        tryEditorPage.clickRunButton();  // Use TryEditorPage method to click the Run button
//    }
//
//    @Then("The user will be presented with the Run output text \"<expectedOutput>\"")
//    public void userSeesRunOutput1(String expectedOutput) {
//        // Implement logic to verify the Run output text matches the expected output
//    }
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//
//    // Navigation scenario steps
//    @Given("The user is logged in")
//    public void userIsLoggedInAlready() {
//        // This step can be reused from the login scenario or implement logic to ensure user is logged in
//    }
//
//    @When("The user clicks on the \"graph\" Get Started button")
//    public void userClicksGraphGetStartedButton() {
//        // Implement logic to click on the "graph" Get Started button (e.g., using page object model)
//    }
//
//    @Then("The user is directed to the \"graph\" page")
//    public void userIsDirectedToGraphPage() {
//        // Implement logic to verify the user is on the "graph" page (e.g., checking for a specific element or text)
//    }
//
//    // Graph functionality scenario steps
//    @When("The user clicks on the \"<graphPageOrRepresentation>\" page")
//    public void userClicksOnGraphPageOrRepresentation(String graphPageOrRepresentation) {
//        // Implement logic to click on either the "graph" page or "graph representation" page based on the parameter
//        // (e.g., using conditional statements or page object model)
//    }
//
//    @When("The user enters \"<data>\" in the TryEditor")
//    public void userEntersDataInTryEditor(String data) {
//        // Implement logic to enter data in the TryEditor (e.g., using page object model)
//    }
//
//    @When("The user clicks the Run button")
//    public void userClicksRunButton() {
//        // Implement logic to click on the Run button (e.g., using page object model)
//    }
//
//    @Then("The user sees the Run output text \"<expectedOutput>\"")
//    public void userSeesRunOutput(String expectedOutput) {
//        // Implement logic to verify the Run output text (e.g., using page object model)
//    }
//
//    // Optional steps for clearing data and entering invalid data
//    // ... (implement these steps if needed)
//}
