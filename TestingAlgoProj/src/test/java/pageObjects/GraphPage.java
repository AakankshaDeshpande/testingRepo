package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class GraphPage extends BasePage {
	
		public GraphPage(WebDriver driver) {
			this.driver =driver;
			PageFactory.initElements(driver,this);
			
		}
		
		@FindBy(xpath="//h5[contains(text(),'Graph')]/..//a")
		public WebElement graphGetStared;
		
		@FindBy(linkText ="Graph Representations")
		public WebElement graphRepLink;
		
		@FindBy(linkText="Graph")
		public WebElement graphLink;
		
	
	// By graphGetStared = By.xpath("//h5[contains(text(),'Graph')]/..//a");
	  //  By graphRepLink = By.linkText("Graph Representations");
	   // By tryHereButton = By.linkText("Try here>>>");
	   // By write = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	   // By run = By.xpath("//button[contains(text(),'Run')]");
	  //  By graphLink = By.linkText("Graph");


}
