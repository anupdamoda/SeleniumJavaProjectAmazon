package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FPWeb_Login_pg {
	
	WebDriver driver;
	
	public int TimeoutValue = 140;
	
	
	FPWeb_Login_pg (WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
	}
	
	
	@FindBy(id="UserName")
	WebElement txtbox_FPWeb_Username;
	
	
	@FindBy(id="Password")
	WebElement txtbox_FPWeb_Password;
	
	@FindBy(id="login_button")
	WebElement btn_FPWeb_Login;
	
	
	public void FPWeb_Login(String uid, String pwd)
	{
		
		
		
	}
	
	

}
