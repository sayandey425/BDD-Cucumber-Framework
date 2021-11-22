package com.bdd.StepDefination;
import com.bdd.pageobject.removecart;
import com.bdd.uistore.ContactusStore;

import Reusable.BaseCases;
import Reusable.Resource;
import io.cucumber.java.en_lol.WEN;
import io.cucumber.java.en_old.Tha;
import io.cucumber.java.nl.Gegeven;


public class removecartstepdefination extends Resource {

	ContactusStore ct = new ContactusStore();
	removecart rc = new removecart();
	BaseCases bc = new BaseCases();
	
	@Gegeven("^Some items is in cart$")
	public void some_items_is_in_cart() throws Throwable {
	    logger.info("Item is present on the Cart");
	}
	@WEN("^User Go to cart$")
	public void user_Go_to_cart() throws Throwable {
		rc.remove_cart(driver);
		Thread.sleep(3000);
	}

	@WEN("^click Remove item form the cart$")
	public void click_Remove_item_form_the_cart() throws Throwable {
		driver.findElement(ContactusStore.removeButton).click();
		Thread.sleep(3000);
	}

	@Tha("^The items should be removed and  verify the page contains cart is empty$")
	public void the_items_should_be_removed_and_verify_the_page_contains_cart_is_empty() throws Throwable {
    String emptycart = driver.findElement(ContactusStore.cartEmpty).getText();
		
		if(emptycart.equalsIgnoreCase("Your cart is currently empty."))
		{
			logger.info("Remove Feature is succesfully validated");
			System.out.println("TestCase :Cart_feature_validation  Succefull ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
		}
	}

	
}
