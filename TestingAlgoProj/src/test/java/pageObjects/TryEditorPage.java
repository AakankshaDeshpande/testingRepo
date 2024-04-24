//package pageObjects;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import DriverFactory.BasePage;
//
//public class TryEditorPage extends BasePage {
//
//    private WebDriver driver;
//
//    public TryEditorPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//    }
//    
//    @FindBy(linkText = "Try here>>>")
//	WebElement tryherebtn;
//    
//   
//
//    public WebElement getTryEditorInput() {
//        // Implement logic to find the TryEditor input element
//        return driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
//    }
//
//    public WebElement getRunButton() {
//        // Implement logic to find the Run button element
//        return driver.findElement(By.xpath("//button[normalize-space()='Run']"));
//    }
//
//    public void enterDataInTryEditor(String data) {
//        getTryEditorInput().clear(); // Clear any existing data before entering new data
//        getTryEditorInput().sendKeys(data);
//    }
//
//    public void clickRunButton() {
//        getRunButton().click();
//    }
//
//
//
//	public void clickGetStartedButton(String section) {
//		String locatorString = "(//a[@href='" + section + "'])[1]";
//	
//		driver.findElement(By.xpath(locatorString)).click();
////		Thread.sleep(3000);
//		
//	}
//
//
//
//	public void clickTryHereButton() {
//		// TODO Auto-generated method stub
//		tryherebtn.click();
//		
//	}
//}
