package com.bdd.StepDefination;

import org.testng.Assert;

import com.bdd.pageobject.CartItem;
import com.bdd.uistore.ContactusStore;

import Reusable.BaseCases;
import Reusable.Resource;
import io.cucumber.java.en_lol.WEN;
import io.cucumber.java.en_old.Tha;
import io.cucumber.java.nl.Gegeven;

public class CartItemStepDefination extends Resource{

	ContactusStore ct = new ContactusStore();
	BaseCases bc = new BaseCases();
	CartItem ci = new CartItem();
	
	@Gegeven("^User on desired website$")
	public void user_on_desired_website() throws Throwable {
	    
	    logger.info("User is on website");
	}

	@WEN("^User Navigate to Shopping Category and clicks on the Travel Gifts$")
	public void user_Navigate_to_Shopping_Category_and_clicks_on_the_Travel_Gifts() throws Throwable {
	   
	    ci.shp(driver);
	    driver.findElement(ContactusStore.TravelGifts).click();
		Thread.sleep(3000);
	}

	@WEN("^Choose Mask frogg Eye Mask$")
	public void choose_Mask_frogg_Eye_Mask() throws Throwable {
	    
		driver.findElement(ContactusStore.Item).click();
		Thread.sleep(3000);
	}

	@WEN("^User do add to cart continue Shopping$")
	public void user_do_add_to_cart_continue_Shopping() throws Throwable {
	   
		driver.findElement(ContactusStore.Cart).click();
		Thread.sleep(2000);
	}

	@Tha("^Item will be  added to shopping cart$")
	public void item_will_be_added_to_shopping_cart() throws Throwable {
	    
		Assert.assertTrue(driver.findElement(ContactusStore.itemCart).isDisplayed());
		boolean display = driver.findElement(ContactusStore.itemCart).isDisplayed();
	    
		System.out.println(display);
		
		System.out.println("To add item in Shopping Cart : Scenario passed");
		
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("\n");
	    
	}


}
