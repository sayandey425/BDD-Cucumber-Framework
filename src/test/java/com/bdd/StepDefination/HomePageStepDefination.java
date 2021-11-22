package com.bdd.StepDefination;
import com.bdd.pageobject.HomePage;
import com.bdd.uistore.ContactusStore;

import Reusable.BaseCases;
import Reusable.Resource;
import io.cucumber.java.en_lol.WEN;
import io.cucumber.java.en_old.Tha;
import io.cucumber.java.nl.Gegeven;

public class HomePageStepDefination extends Resource {
    
	ContactusStore ct = new ContactusStore();
	HomePage hp = new HomePage();
	BaseCases bc = new BaseCases();
	
	
	@Gegeven("^The Browser URl$")
	public void the_Browser_URl() throws Throwable {
	 
		bc.setup();
		
	} 

	@WEN("^User click on the URL$")
	public void user_click_on_the_URL() throws Throwable {
		
		hp.OpenBrowser(driver);
	    
	}

	@Tha("^The Website Should open$")
	public void the_Website_Should_open() throws Throwable {
	    
		String title = driver.getTitle();
		System.out.println(title);
		//Validating the title of the website 
		if(title.equalsIgnoreCase("Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts� Bigsmall.in"))
		{
			logger.info("User is on correct WebPage");
			System.out.println("Website is Validate");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
		}
	}
}
