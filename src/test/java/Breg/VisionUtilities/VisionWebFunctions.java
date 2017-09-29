package Breg.VisionUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VisionWebFunctions {
	
	
	static WebDriver webdriver = null;
	static String pageTitle = null;
	static String pageUrl = null;
	static String getText = null;
	
	public static void BeforeTest() throws Exception{
		
		webdriver = new FirefoxDriver();
	}
	
	public static void AfterTest() throws Exception{
		
		webdriver.quit();
	}
	
	public static void Login() throws Exception{
		
		webdriver.get("http://136.179.23.98/default.aspx");
		webdriver.manage().window().maximize();
		
		webdriver.findElement(By.id("UserName")).sendKeys("testadmin");
		webdriver.findElement(By.id("PassWord")).sendKeys("Breg2007!");
		webdriver.findElement(By.id("Login")).click();
		
		pageUrl = webdriver.getCurrentUrl();
		
		if(pageUrl.equals("http://136.179.23.98/home.aspx")){
			System.out.println("Login Done Successfully");
		}
	}

}
