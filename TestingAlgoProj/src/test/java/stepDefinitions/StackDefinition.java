package stepDefinitions;

import java.io.IOException;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;

public class StackDefinition extends BasePage {
	private final BasePage base;
	Scenario sce;

	public StackDefinition(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
	}
	
	@When("the user clicks on Operation page")
	public void the_user_is_in_operation_page() throws IOException {
		base.getLogger().info("On the implementation page");
		//base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getStackObj().OperInStackLink,0);
	}

	@When("the user clicks on Implementation page")
	public void the_user_is_in_implementation_page() throws IOException {
		base.getLogger().info("On the implementation page");
		//base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getStackObj().ImplementEle,0);
	}

	@When("the user clicks on Application page")
	public void the_user_is_Application_page() throws IOException {
		base.getLogger().info("On the Application page");
		//base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getStackObj().AppliElem,0);
	}
	
	
	


}
