package Imp_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) 
	{
		// count no of links 
		// click on each link and print report in console
		//get each url by html structure and send to url edit
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhilr\\eclipse-workspace\\Selenium_Practice\\Drivers\\chromedriver.exe");
			
			 WebDriver driver = new ChromeDriver();
			 
			 driver.get("https://www.mycontactform.com/");
			 
		        int numberOfLinks = driver.findElements(By.tagName("a")).size();
				// count no of links on page
				System.out.println("Number of links on Web Page :" +numberOfLinks );
			
//				for(int i=0;i<numberOfLinks;i++)
//					
//				{
//					links[i] = driver.getAttribute("href");
//				System.out.println(all_links_webpage.get(i).getAttribute("href"));
//				} 
//				// navigate to each Link on the webpage
//				for(int i=0;i<numberOfLinks;i++)
//				{
//				driver.navigate().to(links[i]);
//				Thread.sleep(3000);
			
			
			 }
				
				
		

	}


