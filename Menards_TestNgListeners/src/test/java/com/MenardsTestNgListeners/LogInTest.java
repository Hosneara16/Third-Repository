package com.MenardsTestNgListeners;

import org.testng.Assert;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInTest extends BaseClass{ //Parent class (BaseClass) inherited by child class
	
	@Test(priority=1)
	public void homePage() {
		driver.get("https://www.menards.com/");
		BaseClass obj = new BaseClass();
		obj.sampleTest(); //method inherited by child class from parent class
		System.out.println("Home page appeared");
		
	}
	
	@Test(dependsOnMethods="homePage")
	public void getTitle() {
		//String gt = driver.getTitle();
		//Assert.assertEquals(gt, "Home at Menards®");
		
		if(driver.getTitle().equals("Home at Menards®")) {
			Assert.assertTrue(true);
			System.out.println("Title matched");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Title did not match");
		}	
		
	}
	

}
