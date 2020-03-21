package com.BOOTCAMP2020.HomeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	@FindBy(className="form-input__field")
	WebElement id;
	
	@FindBy(id="password-input-field")
	WebElement pw;
	
	@FindBy(id="zipCode")
	WebElement zip;
	
	@FindBy(id="phone")
	WebElement Mob;
	
//	@FindBy(className="checkbox-btn")
//	WebElement checkbox1;
//	
//	@FindBy(className="checkbox-btn__label-test u__text-align--left")
//	WebElement checkbox2;
	
	@FindBy(className="bttn__content")
	WebElement create;
	
	
	WebDriver driver;
	public SignUp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Email() {
		id.sendKeys("nigar.rahman12@gmail.com");
	}
	public void Password() {
		pw.sendKeys("HomeDepotAcc12345!!!");
	}
	public void ZipCode() {
		zip.sendKeys("20165");
	}
	public void PhoneNum() {
		Mob.sendKeys("5714917245");
	}
	/* public void Checkboxes() {
		checkbox1.click();
		checkbox2.click();
	} */
	public void Link() {
		create.click();
	}
}
