package com.scenarios;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdowns {

	public static void main(String[] args) {
		
		//Setup
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice.expandtesting.com/dropdown");	//AUT
		
		//Selecting Country
		WebElement countryDropdownElement = driver.findElement(By.id("country"));
		
		Select dropdown = new Select(countryDropdownElement);
		//dropdown.selectByVisibleText("Algeria");	//select this
		//dropdown.selectByValue("AS");
		dropdown.selectByIndex(6);	//index starts from 0	
		
		//Check whether drop down is multi select ?
		if(dropdown.isMultiple()) {
			System.out.println("It is multiselect");
		} else {
			System.out.println("It is multiselect");
		}
		
		//getoptions
		List<WebElement> allOptions = dropdown.getOptions();
		for(WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		
		//teardown
		driver.quit();
	}
}
