package com.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tooltip {

	public static void main(String[] args) throws InterruptedException {
		// Setup
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/"); // AUT
		Thread.sleep(2000);
		
		//will check for 'title' attribute
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		String actualTooltip = element.getAttribute("title");
		
		String expTooltip = "Sign up for Facebook";
		
		Assert.assertEquals(actualTooltip, expTooltip, "Failed");
		System.out.println("Passed");
		
		driver.quit();
	}

}
