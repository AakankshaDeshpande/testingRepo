package pageObjects;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;
import utilities.ElementsUtils;

public class verifyUtil extends BasePage {
	private ElementsUtils elements;

	public verifyUtil(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elements = new ElementsUtils(driver);
	}

	@FindBy(xpath = "//div[@role='alert']")
	WebElement msgLogin;

	@FindBy(id = "id_username")
	@CacheLookup
	WebElement loginusername;

	@FindBy(id = "id_password")
	WebElement loginpwd;

	@FindBy(id = "output")
	WebElement runOutPut;

//	String successmsg =
	String errormsgverify;
	String output;

	@FindBy(linkText = "Sign out")
	WebElement lnkSignout;

	String messageStr;

	public void popup() {
		WebElement activeElement = driver.switchTo().activeElement();
		messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}

	public boolean isLoginPageExists(String expMsg) {
		try {
			// if(loginusername.equals("")|| loginpwd.equals("") )
			System.out.println(expMsg +"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			if (msgLogin.isDisplayed()) {
				errormsgverify = msgLogin.getText();
				if (errormsgverify.trim().equalsIgnoreCase(expMsg.trim())) {
					return (true);
				}

				return (false);
			}

		} catch (Exception e) {
			popup();
			if (messageStr.trim().equalsIgnoreCase("Please fill out this field.")) {
				System.out.println(messageStr +"TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
				return (true);
			}
		}
		return false;

	}

	public boolean isRunEditorValid(String expMsg) throws InterruptedException {
		try {

			boolean alertMsg = isAlertPresent();
			if (alertMsg) {
				return alertMsg;
			} else {
				output = runOutPut.getText();
				
				if (null != output && !output.equalsIgnoreCase("") && expMsg.contains(output.trim())) {
					
					return (true);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean isAlertPresent() {

		boolean presentFlag = false;
		

		
		  try {
		  
		 
		  driver.switchTo().alert().accept(); // Alert present; set
		  presentFlag = true; // if present consume the alert the flag 
		  //alert.accept();
		  
		  } catch (NoAlertPresentException ex) { // Alert not present
		        // ex.printStackTrace();
			      presentFlag = false;
		  
		  }
		 
		return presentFlag;

	}

	public void clickLogout() {
		lnkSignout.click();
	}

}
