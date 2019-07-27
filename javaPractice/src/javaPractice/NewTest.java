package javaPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	  
	
	  driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Mohit");
	  driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Mishra");
	  //driver.findElement(((WebElement) By.xpath(("//input[@name=\"lastname\"]"))).sendKeys("Mishra");
	  driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  driver.get("https://demoqa.com");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
