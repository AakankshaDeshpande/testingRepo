package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;
import utilities.ElementsUtils;

public class SignIn extends BasePage{
private ElementsUtils elements;
	
	public SignIn(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
		elements  = new ElementsUtils(driver);
	}
	
	@FindBy(id = "id_username")
	@CacheLookup
	public static WebElement loginusername;
	
	@FindBy(id = "id_password")
	public static WebElement loginpwd;
	
	@FindBy(linkText = "Sign out") 
	public static WebElement lnkSignout;
	
	
	
	@FindBy(xpath="//input[@value='Login']")
	public static WebElement btnLogin;
	
	public void sendUserName(String uname) {
		loginusername.sendKeys(uname);
	}
	public void sendPwdName(String password) {
		loginpwd.sendKeys(password);
	}
	
	//Clicking Logging Button
	public void clickLogin() {
		btnLogin.click();
		
	}
	  public void clickLogout() 
	  { lnkSignout.click(); 
	  }
	  
		/*
		 * public void doLogin() { elements.clickOnElement(btnLogin, 0);
		 * 
		 * }
		 */
	

}
