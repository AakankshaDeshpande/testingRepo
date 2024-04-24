package utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import freemarker.core.ReturnInstruction.Return;
import io.cucumber.java.Scenario;

public class ElementsUtils extends BasePage {
	
	//private final BasePage base;
	Scenario sce;
	
	WebDriver driver;
	
	public ElementsUtils(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnElement(WebElement element,long durationInSeconds) {
		
		WebElement webElement = waitForElement(element,durationInSeconds);
		webElement.click();
	}
	
	public void typeTextIntoElement(WebElement element,String  textToBeTyped,long durationInSeconds) {
		WebElement webElement = waitForElement(element,durationInSeconds);
		webElement.click();
		webElement.clear();
		webElement.sendKeys(textToBeTyped);
		
	}
	
	public void clearElement(WebElement element,long durationInSeconds) {
		WebElement webElement = waitForElement(element,durationInSeconds);
		webElement.clear();
		
		
	}
	public WebElement waitForElement(WebElement element,long durationInSeconds) {
		WebElement webElement = null ;
	
		try {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		webElement  = wait.until(ExpectedConditions.elementToBeClickable(element));
	}catch(Throwable e) {
		e.printStackTrace();
	}return webElement;
	}
	
	public void selectOptionInDropdown(WebElement element,String dropDownOption,long durationInSeconds)
	{
		WebElement webElement = waitForElement(element,durationInSeconds);
		Select select = new Select(element);
		select.selectByVisibleText(dropDownOption);
		
	}
	
	public void acceptAlert(long durationInSeconds) {
		Alert alert = waitForAlert(durationInSeconds);
		//driver.switchTo().alert().accept();
		alert.accept();
	}
	
	public Alert waitForAlert(long durationInSeconds) {
		Alert alert = null;
		try {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		alert = wait.until(ExpectedConditions.alertIsPresent());
		}catch (Throwable e) {
			e.printStackTrace();
		}
		return alert;
	
	}	
	public void dismissAlert(long durationInSeconds) {
		 Alert alert = waitForAlert(durationInSeconds);
		 alert.dismiss();
		
	}
	
	public void mouseHoverAndClick(WebElement element,long durationInSeconds)
	{
		WebElement webElement = waitForvisibilityOfElement(element,durationInSeconds);
	Actions actions = new Actions(driver);
	actions.moveToElement(webElement).click().build().perform();
	
		
	}

	public WebElement waitForvisibilityOfElement(WebElement element, long durationInSeconds) {
		WebElement webElement = null;
		try {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
	 webElement = wait.until(ExpectedConditions.visibilityOf(element));
		}catch (Throwable e) {
			e.printStackTrace();
		}return webElement;
		
	}
	

}
