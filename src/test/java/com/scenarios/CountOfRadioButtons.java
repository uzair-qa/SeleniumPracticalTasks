package com.scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfRadioButtons {

	public static void main(String[] args) {

		// Setup
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/radio-buttons"); // AUT

		
		List<WebElement> radioBtnList = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radioBtnList.size());
		
		
		// Teardown
		driver.quit();
	}
}
