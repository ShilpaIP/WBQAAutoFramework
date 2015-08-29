package com.wbl.tests.ui;

import java.util.*;

import com.wbl.base.BaseWebTest;
import com.wbl.pages.HomePage;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class HomePageTest extends BaseWebTest {

    private HomePage _hp;

    @BeforeClass
    public void beforeClass() {
        _hp = new HomePage(driver);
    }

    @Test(priority = 1, alwaysRun = true)
    public void testSlidesCount() {
    	
        assertEquals(8, _hp.getSliderItemsCount());
    }
   
    @Test(priority = 1, alwaysRun = true)
    public void testEmailLink(){
    	
    	assertEquals("info@whitebox-learning.com", _hp.getInfoEmail());
    }
    
    @Test(priority = 1, alwaysRun = true)
    public void testSliderTitles(){
    	
    	List<String> titles = _hp.getSliderTitles();
    	Assert.assertTrue(titles.get(1).equalsIgnoreCase("API Testing"));
    	
    }
    
    @Test(priority = 1, alwaysRun = true)
    public void testSliderDecsriptions(){  
    	
    	List<String> descriptions = _hp.getSliderDescriptions();
    	Assert.assertTrue(descriptions.get(3).contains("DevOps and Continuous Integration"));
    }



}