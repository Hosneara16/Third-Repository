package com.WalmartScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenShot {
	
	WebDriver driver;
	
	@Test(priority = 1, description = "Screenshot of a complete page")
	
	public void screenshotOfaPage() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("HomePage.png");
		FileUtils.copyFile(src, trg);
		
		driver.close();
	}
		
		@Test(priority = 2, description = "Screenshot of a section in a page")
		public void screenshotofaSection() throws IOException {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			WebElement pagesection = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]")); 
			File src = pagesection.getScreenshotAs(OutputType.FILE);
			File trg = new File("Featuredproducts.png");
			FileUtils.copyFile(src,trg);
			
			driver.close();
		}
		
		@Test(priority = 3, description = "Taking screenshot of a element")
		public void screenshotOfaElement() throws IOException {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			WebElement wele = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[3]/div/div[1]/div/div/a/img")); 
			File src = wele.getScreenshotAs(OutputType.FILE);
			File trg = new File("logo.png");
			FileUtils.copyFile(src,trg);
			
			driver.close();
			
		}
	

}
