package Breg.VisionTestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Breg.VisionUtilities.VisionWebFunctions;

public class WebTestCases {
	
	@BeforeTest
	public void beforeTest() throws Exception {	
		
		System.out.println("=== Start Firefox Browser ===");
		VisionWebFunctions.BeforeTest();
	}
	
	@AfterTest
	public void afterTest() throws Exception {
		
		VisionWebFunctions.AfterTest();
		System.out.println("=== Closed Firefox Browser ===");			
	}
	
	@Test(priority=1,enabled=true)
	public void loginTestCase() throws Exception {
	   System.out.println("=== Start Login Testcase ===");
	   VisionWebFunctions.Login();
	   System.out.println("=== End Login Testcase ===");
	}

}
