package VisionUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisionWebFunctions {
	
	
	static WebDriver webdriver = null;
	static String pageTitle = null;
	static String pageUrl = null;
	static String getText = null;
	
	public static void Login() throws Exception{
		
		System.setProperty("webdriver.gecko.driver", "/Users/Shared/Jenkins/Home/workspace/Breg_Vision_Web/Drivers/geckodriver");
		
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		webdriver = new FirefoxDriver();
		
		
		webdriver.get("	http://136.179.23.98/default.aspx");
		webdriver.manage().window().maximize();
		
		
		WebDriverWait name = new WebDriverWait(webdriver,20);
		name.until(ExpectedConditions.presenceOfElementLocated(By.id("UserName")));  
		
		webdriver.findElement(By.id("UserName")).sendKeys("testadmin");
		System.out.println("Batchu");
		
		WebDriverWait pass = new WebDriverWait(webdriver,20);
		pass.until(ExpectedConditions.presenceOfElementLocated(By.id("PassWord"))); 
	    
		webdriver.findElement(By.id("PassWord")).sendKeys("Breg2007!");
		System.out.println("Kavya");
		
		WebDriverWait login = new WebDriverWait(webdriver,20);
		login.until(ExpectedConditions.presenceOfElementLocated(By.id("Login")));
		
		webdriver.findElement(By.id("Login")).click();
		
		pageUrl = webdriver.getCurrentUrl();
		
		if(pageUrl.equals("http://136.179.23.98/home.aspx")){
			System.out.println("Login Done Successfully");
		}
	}

}
