package javaPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Sequencing  {
  @Test
  public void testmenthod1() {
	  System.out.println("In the test menthod 1 ");
  }
  
  @Test
  public void testmenthod2() {
	  System.out.println("In the test menthod 2 ");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("In the Before method  menthod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("In the after method menthod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("In the before class menthod");
  }
  

  @AfterClass
  public void afterClass() {
	  System.out.println("In the after class menthod");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("In the before test menthod");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("In the  after test menthod");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("In the before suite menthod");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("In the after suite menthod");
  }

}
