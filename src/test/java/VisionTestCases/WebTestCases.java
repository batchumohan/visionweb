package VisionTestCases;

import org.testng.annotations.Test;

import VisionUtilities.VisionWebFunctions;

public class WebTestCases {
	

	@Test(priority=1,enabled=true)
	public void loginTestCase() throws Exception {
	   System.out.println("=== Start Login Testcase ===");
	   VisionWebFunctions.Login();
	   System.out.println("=== End Login Testcase ===");
	}
	
}
