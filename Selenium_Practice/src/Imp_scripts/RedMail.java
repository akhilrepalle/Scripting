package Imp_scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class RedMail {

	public static void main(String[] args) throws Throwable 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhilr\\eclipse-workspace\\Selenium_Practice\\Drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.rediff.com");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[2]")).click();
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Akhil");
		 driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("VAM6627");
		 
		 driver.findElement(By.id("newpasswd")).sendKeys("Iloveuniverse@143");
		 
		 driver.findElement(By.id("newpasswd1")).sendKeys("Iloveuniverse@143");
		 
		 driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("akhilnaidu211");
		 
		 driver.findElement(By.id("mobno")).sendKeys("9640333680");
		 
//	WebElement	dropdowndate= driver.findElement(By.xpath("//select[@name='DOB_Day0501ce21']"));
//
//Select S=new Select(dropdowndate);
//S.selectByVisibleText("27");
//
//driver.close();
		 
		 WebElement day = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		 String expectedOptions [] = {"Select from the list", "What is the name of your first school?", "What is your favourite pass-time?", "What is your favourite food?", "What is your exact time of birth?"};
	        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select"));
	        List<WebElement> weblinks = driver.findElements(By.tagName("a"));
		 Select sel = new Select(dropdown);
	        Select day1 = new Select(day);
	        day1.selectByVisibleText("13");
	        WebElement month = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	        Select month1 = new Select(month);
	        month1.selectByVisibleText("JUL");
	        WebElement year = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	        Select year1 = new Select(year);
	        year1.selectByVisibleText("2004");
	        

	        WebElement city = driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
	        Select city1 = new Select(city);
	        city1.selectByVisibleText("Chennai");
	        
	        driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[2]")).click();
	        
	        driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();

	        Thread.sleep(10000);
	        
	        List <WebElement> options=sel.getOptions();
	        for(int i = 0; i<options.size(); i++) {
	            Assert.assertEquals(options.get(i).getText(), expectedOptions[i]);


	        }
	        System.out.println("Hiiii.....");
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.quit();
	    }

	

	}


