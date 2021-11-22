package com.bdd.StepDefination;
import com.bdd.uistore.ContactusStore;

import Reusable.BaseCases;
import Reusable.Resource;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.nl.Gegeven;

public class WishLIstStepDefination extends Resource{
   
	ContactusStore ct = new ContactusStore();
	BaseCases bc = new BaseCases();
	@Gegeven("^User is on What's New Page$")
	public void user_is_on_What_s_New_Page() throws Throwable {
	    
		logger.info("This is What's New Page");
	    
	}

	@When("^Select Friends Bobblehead click on Add to wishlist$")
	public void select_Friends_Bobblehead_click_on_Add_to_wishlist() throws Throwable {
	    
		driver.findElement(ContactusStore.Bobblehead).click();
		Thread.sleep(4000);
		driver.findElement(ContactusStore.wishlist).click();
		Thread.sleep(3000);
	}

	@Then("^Wishlist will open with that Item$")
	public void wishlist_will_open_with_that_Item() throws Throwable {
	    
		driver.findElement(ContactusStore.wishlistmenu).click();
		Thread.sleep(3000);
		driver.findElement(ContactusStore.access).click();
		Thread.sleep(3000);
		String addset = driver.findElement(ContactusStore.add).getText();
		System.out.println(addset);
	}


}
