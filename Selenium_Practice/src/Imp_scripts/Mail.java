package Imp_scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mail {
    WebDriver driver;
    @Test
    public void multiplewindow() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhilr\\eclipse-workspace\\Selenium_Practice\\Drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        driver.manage().window().maximize();
        List<WebElement> weblinks = driver.findElements(By.tagName("a"));
        int linkscount = weblinks.size();
        System.out.println(linkscount);
        System.out.println(driver.getTitle());

        //Multiple window handling:



        driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Akhil");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("Akhil.Repalle");
        driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("Akhil@144");
        driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("Akhil@144");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();


        String expectedOptions [] = {"Select from the list", "What is the name of your first school?", "What is your favourite pass-time?", "What is your favourite food?", "What is your exact time of birth?"};
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select"));
        Select sel = new Select(dropdown);
        sel.selectByVisibleText("What is the name of your first school?");
        driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input")).sendKeys("AkhilRepalle");
        driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[6]/td[3]/input")).sendKeys("KrishnaRao");
        driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("9999999999");
        WebElement day = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
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

        Thread.sleep(10000);

        //driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();

        List <WebElement> options=sel.getOptions();
        for(int i = 0; i<options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOptions[i]);


        }
        System.out.println("Hiiii.....");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.quit();
    }

}