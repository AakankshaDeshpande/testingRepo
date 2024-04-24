package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class helperClass extends BasePage {

	public helperClass(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
		
	}
		
	
	@FindBy(xpath = "//a[normalize-space()='Practice Questions']")
	@CacheLookup
	public WebElement practicequestions;
	
	@FindBy(linkText = "Try here>>>")
	public WebElement tryherebtn;
	
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	//@FindBy(xpath = "//textarea[@autocorrect='off']")
	public WebElement textArea;
	
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	public WebElement runBtn;
	
	@FindBy(linkText = "Sign out") 
	public WebElement lnkSignout;
	

	
	 public void ClickTryHere() {
		 tryherebtn.click();
	    }
	 
	 public void ClickRun() {
		 runBtn.click();
	    }
	 
	 public void Practicequestions() {
		 practicequestions.click();
	    }
	 
	 public void enterText(String text) throws InterruptedException {
		
		 textArea.sendKeys(text);
	 }
		
	 
	 public void clickLogout() 
	  { lnkSignout.click(); 
	  }
	 
	 
	 public boolean  urlVerify(String string) {
		// msgLogin.getText();
		 try {
		 String exp_url=string;
		 String curUrl= driver.getCurrentUrl();
		 if(curUrl.equalsIgnoreCase(exp_url))
		 {
			 return(true);
		 }return(false);
		 }catch (Exception e) {
			 return(false);
		}
		 
		 
		 

	 }

	 
			
	}
	
