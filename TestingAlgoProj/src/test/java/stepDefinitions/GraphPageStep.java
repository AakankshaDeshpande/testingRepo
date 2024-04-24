package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GraphPageStep extends BasePage {
	private final BasePage base;
	Scenario sce;
	Properties p;
	
	public GraphPageStep(BasePage base) throws IOException {
		this.driver = Hooks.getDriver();
		this.base = base;
		//base.InitializePageObject(driver, sce);

	}
	@Given("The user is in graph {string} page")
	public void The_user_is_in_graph_page(String string) throws IOException, InterruptedException {
		base.getLogger().info("On the graphUrl page");
		//p = base.getProperties();
		//base.InitializePageObject(driver, sce);
		driver.get("https://dsportalapp.herokuapp.com/graph/");
		Thread.sleep(4000);

	}
	
	@When("the user clicks on graph page")
	public void the_user_is_in_graph_page() throws IOException {
		base.getLogger().info("On the graph page");
		//base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getGraphPageObj().graphLink,0);

	}
	

	
	@When("the user clicks on graphRepresentation page")
	public void the_user_clicks_on_graph_representation_page() throws IOException, InterruptedException {
		System.out.println("GRAPH REPRESTATION 123");
		base.getLogger().info("On the GraphRepresentation page");
		//base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getGraphPageObj().graphRepLink,0);
		Thread.sleep(2000);
	}
	
	
	

	
	@Given("^The user is on the \"([^\"]*)\" page for practice question$")
    public void the_user_is_on_the_page_for_practice_question(String page) {
        // Implementation to navigate to the specified page for practice questions
    }
	
	
}
