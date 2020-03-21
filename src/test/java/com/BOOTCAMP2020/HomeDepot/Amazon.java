package com.BOOTCAMP2020.HomeDepot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Amazon {
	WebDriver driver;
  @Test
  public void f() {
	  driver.navigate().to("https://www.amazon.com/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
	  driver.findElement(By.className("nav-input")).click();
	  driver.findElement(By.xpath("(//*[@dir='auto'])[103]")).click();
	  driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
	  
//	  Actions control= new Actions(driver);
//	  driver.switchTo().frame(0);
//	  driver.findElement(By.xpath("//*[@id='attachSiNoCoverage-announce']")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nigar Muneer\\eclipse-workspace\\HomeDepot\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
