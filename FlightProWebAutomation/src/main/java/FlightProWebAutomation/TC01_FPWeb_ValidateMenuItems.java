package FlightProWebAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01_FPWeb_ValidateMenuItems {
	
	
	@BeforeMethod
	public void killbrowsers()
	{
		
	try {
		Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
	} catch (IOException e)
	
	{
		e.printStackTrace();	
	}
	}
	
	@Test
	
	public void ValidateMenuItems()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_GoogleChromeDriverV2\\chromedriver.exe");

		
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("http://oc-svr-at1/FlightPro_WEB_v8/Login/Login");
		
		driver.findElement(By.id("UserName")).sendKeys("automate8");
		driver.findElement(By.id("Password")).sendKeys("automate8");
		
		driver.findElement(By.id("login_button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"href12058\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		
		driver.findElement(By.xpath("//*[@id=\"people-selector-button\"]")).click();
		
	}
	
	 

}
	
	
	
