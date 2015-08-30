package com.wbl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



import com.wbl.utils.PageDriver;

public class RegistrationPage extends PortalPage {

	public RegistrationPage(PageDriver driver) {
		super(driver);
		_logger.debug("Open Registration Page");
		driver.findElement("home.enrollnow.link").click();
	}
	
	public String verifyRegistrationPage(){
		
		return driver.findElement("h1.heading-title").getText();
	}
	
	public String validRegistration(String email, String pswd, String fullname, String phone, String address, String city, String zip, String country, String msg){
		
		driver.findElement("register.username").type(email);
		driver.findElement("register.password").type(pswd);
		driver.findElement("register.fullname").type(fullname);
		driver.findElement("register.phone").type(phone);
		driver.findElement("register.address").type(address);
		driver.findElement("register.city").type(city);
		driver.findElement("register.zip").type(zip);
		Select cntryLocation = new Select((WebElement) driver.findElement("register.country"));
		cntryLocation.selectByValue(country);
		driver.findElement("register.messgae").type(msg);
		driver.findElement("register.register").click();
		
		return driver.findElement("register.valid.msg").getText();
		
	}

}
