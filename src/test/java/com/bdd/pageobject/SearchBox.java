package com.bdd.pageobject;

import org.openqa.selenium.WebDriver;

import com.bdd.uistore.ContactusStore;

import Reusable.Resource;



public class SearchBox extends Resource{
       
	ContactusStore ct = new ContactusStore();
	public void clickonSearchbox(WebDriver driver)
	{
		driver.navigate().to(browserURL);
		
	}
}
