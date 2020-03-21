package com.BOOTCAMP2020.HomeDepot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class HomeDepotTest {
	WebDriver driver;
	
  @Test(priority=1)
  public void f() {
	  //driver.navigate().to("https://www.homedepot.com/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("headerMyAccountTitle")).click();
	  driver.findElement(By.xpath("//*[text()='Register']")).click();
  
//  @Test(priority=2)
//  public void Register() {
	  SignUp newAcc = new SignUp(driver);
	  newAcc.Email();
	  newAcc.Password();
	  newAcc.ZipCode();
	  newAcc.PhoneNum();
	 // newAcc.Checkboxes();
	  newAcc.Link();
	  
	//driver.findElement(By.xpath("//*[text()='Skip for Now & Create My Account']")).click();
	  }
  @BeforeClass
  @Parameters({"URL", "Browser"})
  public void beforeClass(String website, String browser) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nigar Muneer\\eclipse-workspace\\HomeDepot\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.navigate().to(website);
  }

  @AfterClass
  public void afterClass() {
  }

}
