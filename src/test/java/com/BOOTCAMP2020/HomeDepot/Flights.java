package com.BOOTCAMP2020.HomeDepot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Flights {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.navigate().to("https://www.expedia.com/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//*[@id='tab-flight-tab-hp']")).click();
	  driver.findElement(By.xpath("//*[@id='flight-origin-hp-flight']")).sendKeys("IAD");
	  driver.findElement(By.xpath("//*[@id='flight-destination-hp-flight']")).sendKeys("LAS");
	  
	  driver.findElement(By.xpath("//*[@id='flight-departing-hp-flight']")).click();
	  driver.findElement(By.xpath("(//*[@class='datepicker-cal-date'])[12]")).click();
	  
	  driver.findElement(By.id("flight-returning-hp-flight")).click();
	  driver.findElement(By.xpath("(//*[@data-month='3'])[30]")).click();
	  
	  driver.findElement(By.xpath("(//*[@type='button'])[28]")).click();
	  for(int i=1; i<3; i++) {
		  driver.findElement(By.xpath("(//*[@height='24'])[2]")).click();
	  }
	  
//	  for(int j=1; j<2; j++) {
//		  driver.findElement(By.xpath("(//*[@height='24'])[4]")).click();
//		  driver.findElement(By.xpath("(//*[@height='24'])[6]")).click();
//	  }
	  driver.findElement(By.xpath("(//*[@type='submit'])[11]")).click();
	  System.out.println("URL after submitting the passenger info = " +driver.getCurrentUrl());
	  
	  driver.findElement(By.xpath("(//*[@type='button'])[31]")).click();
	  System.out.println("Clicks on search icon of the flight = " +driver.getCurrentUrl());
	  
	 // driver.findElement(By.xpath("(//*[@type='button'])[33]")).click();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nigar Muneer\\eclipse-workspace\\HomeDepot\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
  }

}
