package com.wbl.pages;

import java.util.*;

import com.wbl.utils.HtmlElement;
import com.wbl.utils.PageDriver;

/**
 * Created by svelupula on 8/14/2015.
 */
public class HomePage extends PortalPage {

    public HomePage(PageDriver driver) {
        super(driver);
        _logger.debug("Open Home Page");
        driver.findElement("header.home").click();
    }

    public int getSliderItemsCount() {
        return driver.findElements("home.slider.items").size();
    }
    
    public String getInfoEmail(){
    	return driver.findElement("email.link").getText();
    }
    
    public List<String> getSliderTitles(){
    	List<String> sliderTitles = new ArrayList<String>();
    	
    	Collection<HtmlElement> allTitles =  driver.findElements("home.slider.title");
    	 if (allTitles.size() > 0) {      
    		 for(HtmlElement element : allTitles){
    			 String title = element.getText();
    			 sliderTitles.add(title);
    		 }
    	}
    	return sliderTitles;
    }
    
    public List<String> getSliderDescriptions(){
    	List<String> sliderDescriptions = new ArrayList<String>();
    	
    	Collection<HtmlElement> allDescriptions =  driver.findElements("home.slider.title");
    	 if (allDescriptions.size() > 0) {      
    		 for(HtmlElement element : allDescriptions){
    			 String title = element.getText();
    			 sliderDescriptions.add(title);
    		 }
    	}
    	return sliderDescriptions;
    }
    
   
    
  
    
    
    

}