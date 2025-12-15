package com.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScrollWebPage {

	WebDriver driver;
	JavascriptExecutor jse;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/"); // AUT
		
		jse = (JavascriptExecutor)driver;
	}

	@Test
	public void scrollByPixel() throws InterruptedException {
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
	}
	
	@Test
	public void scrollByElement() throws InterruptedException {
		WebElement element = driver.findElement(By.linkText("privacy policy"));
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(2000);
	}
	
	@Test
	public void scrolltoBottom() throws InterruptedException {
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
	}
	
	@Test
	public void horizontalScrollonWebpage() throws InterruptedException {
		WebElement element = driver.findElement(By.linkText("privacy policy"));
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView();",element);
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
