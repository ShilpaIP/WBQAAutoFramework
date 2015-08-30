package com.wbl.tests.ui;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.base.BaseWebTest;
import com.wbl.pages.HomePage;
import com.wbl.pages.RegistrationPage;

public class RegistrationPageTest extends BaseWebTest {
	
	 	private RegistrationPage rp;
	 	//private HomePage hp;


	    @BeforeClass
	    public void beforeClass() {
	        rp = new RegistrationPage(driver);
	    }
	    
	    
	    @Test
	    public void testValidRegistration(){
	    	
	    	String validMsg = rp.validRegistration("test@test.com", "abc123", "Mary Kom", "555-555-5555", "6500 Dublin Blvd", "dublin", "94538", "US", "Test");
	    	Assert.assertTrue(validMsg.contains("registered!"));
	    }
	    
	   

}
