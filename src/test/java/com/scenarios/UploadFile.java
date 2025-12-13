package com.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {

		// Setup
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download"); // AUT
		
		//upload
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\Lenovo\\Desktop\\Sample.txt");
	}
}
