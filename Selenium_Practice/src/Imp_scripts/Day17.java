package Imp_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day17 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhilr\\eclipse-workspace\\Selenium_Practice\\Drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.orangehrm.com/");
//		 System.out.println(driver.getTitle());
//		 System.out.println(driver.getCurrentUrl());
//		 System.out.println(driver.getPageSource());
		 
		 
		 //is displayed() is enabled()
		 
		 driver.findElement(By.xpath("//*[@id=\"myText\"]"));  
		 
		 

	}

}
