package com.bdd.StepDefination;
import com.bdd.pageobject.GiftCard;
import com.bdd.uistore.ContactusStore;

import Reusable.BaseCases;
import Reusable.Resource;
import io.cucumber.java.en_lol.WEN;
import io.cucumber.java.en_old.Tha;
import io.cucumber.java.nl.Gegeven;

public class GiftCardStepDefination extends Resource {

	ContactusStore ct = new ContactusStore();
	GiftCard gc=new GiftCard();
	BaseCases bc = new BaseCases();
	
	@Gegeven("^Gift Card should be present in the website$")
	public void gift_Card_should_be_present_in_the_website() throws Throwable {
	    logger.info("Gift Card feature is present");
	}

	@WEN("^User Navigate to gift card$")
	public void user_Navigate_to_gift_card() throws Throwable {
		gc.giftcard(driver);
	}

	@WEN("^click on that$")
	public void click_on_that() throws Throwable {
	    logger.info("User clicks");
	}

	@Tha("^new page will open veify the new page contains the text Rs\\.$")
	public void new_page_will_open_veify_the_new_page_contains_the_text_Rs() throws Throwable {
	    
         String card = driver.findElement(ContactusStore.rupees).getText();
		
		if(card.equalsIgnoreCase("Rs. 500"))
		{
			logger.info("giftcard features succesfully validate");
			
			System.out.println("TestCase :Gift_Card_validation  Succefull ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
		}
	}


}
