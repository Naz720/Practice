package frames;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class test {
	@Test
	  public void setup() throws InterruptedException {
	        WebDriver driver;
	        driver=new ChromeDriver();
	        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	                driver.manage().window().maximize();
	      
	        driver.findElement(By.id("name")).sendKeys("hello");
	        Thread.sleep(1000);
	                System.out.println();
	        driver.switchTo().frame(driver.findElement(By.id("frm3")));
	        Thread.sleep(1000);
	        driver.switchTo().frame(driver.findElement(By.id("frm1")));
	        Thread.sleep(1000);
	        Select sc=new Select(driver.findElement(By.id("course")));
	        sc.selectByVisibleText("Javascript");
	                System.out.println(driver.switchTo().parentFrame());
	                driver.findElement(By.id("name")).sendKeys("1235");
	        driver.findElement(By.id("name")).clear();
	       
	       driver.close();
	    }

}
