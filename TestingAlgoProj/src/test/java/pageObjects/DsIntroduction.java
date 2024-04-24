package pageObjects;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import DriverFactory.BasePage;

public class DsIntroduction extends BasePage {
	
	  public DsIntroduction(WebDriver driver) {
			this.driver =driver;
			PageFactory.initElements(driver,this);
			
		}
	    
	
	
	@FindBy(linkText ="Register")
	WebElement lnkRegister;
	
	// By RegisterLink = By.linkText("Register");
	
	@FindBy(xpath = "//div[@role='alert']")  
	WebElement msgLogin;
	

	@FindBy(linkText = "Data Structures")  
	WebElement staticdropdown;  
	
	@FindBy(className = "dropdown-menu")  
	WebElement dropMenu;  
	
	
	 public void ClickRegister() {
		 lnkRegister.click();
	    }
	 
	 public void clickRegistrationLink() {
		 lnkRegister.click();
		}
	 
	 public void clickDropDown() {
		 staticdropdown.click();
	 }
	 
	   
	 
	   String expectedOptions[] ={"Arrays","Linked List","Stack","Queue","Tree","Graph"};
	 
	 public boolean getDropMenu() {
		 
		  List<WebElement> optionElements =driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//a"));
			String[] optionarray = new String[6];
			
			
			for(int i=0;i<optionElements.size();i++)
			{
				optionarray[i] = optionElements.get(i).getText();
						
			  String expstr = expectedOptions[i];	
			   //Assert.assertEquals(optionarray[i],expstr);
			  if(optionarray[i].equalsIgnoreCase(expstr))
			  {
				  return true;
			  }else
			  {
				  return false;
			  }
			}return false;
	    }
		
		 
		 
		
		
		
	 
	 public boolean  Errormsg(String string) {
		// msgLogin.getText();
		 String exp_msg=string;
		 try {
		 
		 if(msgLogin.isDisplayed()) {
				String errormsgverify=msgLogin.getText(); 
				if(errormsgverify.trim().equalsIgnoreCase(exp_msg.trim()))
				{
					return (true);	
				} return false;
			}
		 }
		 catch (Exception e) {
			
		}
		
		 return false;
	    

}
	
}
