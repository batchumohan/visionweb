package VisionUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisionWebFunctions {
	
	
	static WebDriver webdriver = new FirefoxDriver();
	static String pageTitle = null;
	static String pageUrl = null;
	static String getText = null;
	
	public static void Login() throws Exception{
		
		
		webdriver.get("http://136.179.23.98/default.aspx");
		webdriver.manage().window().maximize();
		
		WebDriverWait name = new WebDriverWait(webdriver,30);
		name.until(ExpectedConditions.presenceOfElementLocated(By.id("UserName")));  
		
		webdriver.findElement(By.id("UserName")).sendKeys("testadmin");
		System.out.println("Batchu");
		
		WebDriverWait pass = new WebDriverWait(webdriver,30);
		pass.until(ExpectedConditions.presenceOfElementLocated(By.id("PassWord"))); 
	    
		webdriver.findElement(By.id("PassWord")).sendKeys("Breg2007!");
		System.out.println("Kavya");
		webdriver.findElement(By.id("Login")).click();
		
		pageUrl = webdriver.getCurrentUrl();
		
		if(pageUrl.equals("http://136.179.23.98/home.aspx")){
			System.out.println("Login Done Successfully");
		}
	}

}
