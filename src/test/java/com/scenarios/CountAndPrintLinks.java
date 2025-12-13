package com.scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAndPrintLinks {

	public static void main(String[] args) {
		//Setup
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/"); //AUT
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));	
		
		//Total no. of links
		System.out.println("Total links on webpage: " + linkElements.size());
		
		//Printing each link text
		for(WebElement element : linkElements) {
			System.out.println(element.getText());
		}
		
		//Teardown
		driver.quit();
	}
}
