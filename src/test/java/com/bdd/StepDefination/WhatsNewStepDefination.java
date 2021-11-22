package com.bdd.StepDefination;
import com.bdd.pageobject.WhatsNew;
import com.bdd.uistore.ContactusStore;

import Reusable.BaseCases;
import Reusable.Resource;
import io.cucumber.java.en_lol.WEN;
import io.cucumber.java.en_old.Tha;
import io.cucumber.java.nl.Gegeven;

public class WhatsNewStepDefination extends Resource {
 
	ContactusStore ct = new ContactusStore();
	WhatsNew wn = new WhatsNew();
	BaseCases bc = new BaseCases();
	
	
	@Gegeven("^User is on Whats New Page$")
	public void user_is_on_Whats_New_Page() throws Throwable {
	    logger.info("This is What's New Page");
	    
	}
	@WEN("^User click on the box Whats New$")
	public void user_click_on_the_box_Whats_New() throws Throwable {
	    
	    wn.clickonWhatsNew(driver);
	    driver.findElement(ContactusStore.whatsnew).click();
	}

	@Tha("^New Page will open containing the text What's New$")
	public void new_Page_will_open_containing_the_text_What_s_New() throws Throwable {
	    
		String wntext = driver.findElement(ContactusStore.wnpage).getText();
		System.out.println(wntext);
		
		if(wntext.equalsIgnoreCase("What'S New"))
		{
			logger.info("User is What'S New PAage");
			
			System.out.println("TestCase :Feature_Validation_1  Succefull ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
		}
	}


	
}
