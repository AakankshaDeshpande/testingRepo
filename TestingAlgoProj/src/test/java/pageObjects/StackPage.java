package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class StackPage extends BasePage{
	public StackPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
		
	}
	

@FindBy(xpath="//a[normalize-space()='Operations in Stack']")
public WebElement OperInStackLink;

@FindBy(linkText="Implementation")
public WebElement ImplementEle;

@FindBy(linkText="Applications")
public WebElement AppliElem;


}
