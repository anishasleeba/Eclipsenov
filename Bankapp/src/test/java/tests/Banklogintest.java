package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Bankloginpage;

public class Banklogintest extends Baseclass {
//	WebDriver driver;
//	
//	@BeforeTest
//	public void setUp() {
//		driver =  new EdgeDriver();
//		driver.get("https://www.facebook.com");
//	}
	
	@Test
	public void testlogin() {
		Bankloginpage ob=new Bankloginpage(driver);
		ob.setValues("abc@gmail.com","12345");
		ob.login();
		
	}

}
