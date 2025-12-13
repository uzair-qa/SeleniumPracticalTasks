package com.scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {

		// Setup
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/"); // AUT
		
		//find second cell in web table and print second cell data
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		
		//find total rows in webtable
	 	List<WebElement> rowList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
	 	System.out.println("Rows: " + rowList.size());	//total no. of rows
	 	
	 	//find total col in webtable
	 	List<WebElement> columnList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
	 	System.out.println("Columns: " + columnList.size());	
		
	 	for(int r=2; r<=rowList.size(); r++) {	//2,3	//row
	 		
	 		for(int c=1; c<=columnList.size(); c++) {	//1,2	//column
	 			
	 			String data = driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c + "]")).getText();
	 			System.out.println(data);
	 		}
	 	}
	 	
		driver.quit();
	}

}
