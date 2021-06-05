package com.MenardsTestNgListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	private String name;
	 public static WebDriver driver;

	 
	 
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Empty browser opened");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	public void sampleTest() {
		System.out.println("This is sample");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Browser closed successfully");
	}

}
