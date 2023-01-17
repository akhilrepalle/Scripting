package Imp_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Akhil2 {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhilr\\eclipse-workspace\\Selenium_Practice\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://54.234.110.71:8180/pc/PolicyCenter.do");
	
	driver.manage().window().maximize();	
	
	
	 //driver.findElement(By.xpath("//input[@type='submit']")).click();
	//driver.findElement(By.xpath("//type[@name='Login-LoginScreen-LoginDV-username']")).click();
	
	driver.findElement(By.name("Login-LoginScreen-LoginDV-username")).sendKeys("su");
	driver.findElement(By.name("Login-LoginScreen-LoginDV-password")).sendKeys("gw");
	
	
	driver.findElement(By.xpath("//div[@class='gw-action--inner gw-hasDivider']")).click();
	//driver.findElement(By.xpath("//div[@class='gw-action--inner']")).click();
	driver.findElement(By.xpath("//*[@id=\"gw-TabBarWidget--settings\"]/div[1]/span")).click();
	 
	 
	
	 
	
	// div[@class='gw-action--inner gw-hasDivider']
	}

}
