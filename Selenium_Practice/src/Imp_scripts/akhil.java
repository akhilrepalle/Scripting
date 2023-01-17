package Imp_scripts;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class akhil {

	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhilr\\eclipse-workspace\\Selenium_Practice\\Drivers\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
//	 
//	 driver.get("https://www.google.co.in/");
//	 
//	 Dimension dim = new Dimension(400,100);
//     driver.manage().window().setSize(dim);
//	 driver.manage().window().maximize();
//	 Thread.sleep(5000);
//	 driver.navigate().to("https://www.orangehrm.com/");
//	 driver.navigate().back();
//	 Thread.sleep(2000);
//	 driver.navigate().forward();       
//	 Thread.sleep(2000);
//	 driver.navigate().refresh();
	 
	 
	 driver.get("http://eaapp.somee.com/");
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.id("registerLink")).click();
	 
	 driver.findElement(By.id("UserName")).sendKeys("akhilnaidu");
	 
	 driver.findElement(By.name("Password")).sendKeys("Value@143");
	 
	 driver.findElement(By.name("ConfirmPassword")).sendKeys("Value@143");
	 
	 driver.findElement(By.id("Email")).sendKeys("akhil211@gamil.com");
	 
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
 
 
	 driver.findElement(By.className("btn btn-default")).click();
	 
	 
	 
	 
	 
//	 driver.findElement(By.id("guide-icon")).click();
//	 
//	 driver.findElement(By.className("title style-scope ytd-guide-entry-renderer")).click();
//	 driver.get("https://accounts.google.com/ServiceLogin/signinchooser?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&ifkv=ARgdvAtBS5W4vMdhOCFi1O_mUuyl7hrMbJmYdMEnsk5qbPv4CRD4UtpqsMc7YBXL4wFWP0puBzzPgw&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//	 driver.findElement(By.id("identifierId")).sendKeys("akhilnaidu211");
//	 driver.findElement(By.xpath("//span[text()='Next']")).click();
//	 driver.findElement(By.xpath("//span[text()='Next']")).click();
//	 Thread.sleep(5000);
//	 driver.findElement(By.xpath("//a[@class=\"WpHeLc VfPpkd-mRLv6 VfPpkd-RLmnJb\"]")).click();

}

}
