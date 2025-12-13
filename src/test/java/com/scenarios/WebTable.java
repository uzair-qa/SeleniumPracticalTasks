package com.scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		// Setup
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:\\QA-Automation-Workspace\\Personal Projects\\Docs\\sampleTable.html"); // AUT
		
		//find second cell in web table and print second cell data
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		
		//find total rows in webtable
	 	List<WebElement> rowList = driver.findElements(By.xpath("//table/tbody/tr"));
	 	System.out.println("Rows: " + rowList.size());
	 	
	 	//find total col in webtable
	 	List<WebElement> columnList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
	 	System.out.println("Columns: " + columnList.size());
		
	 	for(int r=2; r<=rowList.size(); r++) {	//2,3
	 		
	 		for(int c=1; c<=columnList.size(); c++) {	//1,2
	 			
	 			String data = driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c + "]")).getText();
	 			System.out.println(data);
	 		}
	 	}
	 	
		driver.quit();
	}

}
