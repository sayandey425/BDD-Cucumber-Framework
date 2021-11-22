package com.bdd.StepDefination;
import java.util.ArrayList;

import com.bdd.pageobject.Signin;
import com.bdd.uistore.ContactusStore;
import com.bdd.utility.ExcelUtility;

import Reusable.BaseCases;
import Reusable.Resource;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_lol.WEN;
import io.cucumber.java.nl.Gegeven;

public class SigninStepDefination extends Resource{
	
	ContactusStore ct = new ContactusStore();
	Signin sp = new Signin();
	BaseCases bc = new BaseCases();
	
	@Gegeven("^User should be on sign in page$")
	public void user_should_be_on_sign_in_page() throws Throwable {
	    sp.sign(driver);
	}  

	@WEN("^Click on sign in$")
	public void click_on_sign_in() throws Throwable {
	    
	    logger.info("User clicks on sign in");
	}

	@WEN("^Provide wrong credential$")
	public void provide_wrong_credential() throws Throwable {
	    
		ExcelUtility el = new ExcelUtility();
		ArrayList<String>data = el.getData("a");
		System.out.println(data.size());
		
		String mail1 = (String) data.get(1);
		String pass1 = data.get(2);
		driver.findElement(ContactusStore.mail).sendKeys(mail1);
		driver.findElement(ContactusStore.pass).sendKeys(pass1);
		Thread.sleep(3000);
		driver.findElement(ContactusStore.signin).click();
	}

	@Then("^The page should contain Incorrect email or password$")
	public void the_page_should_contain_Incorrect_email_or_password() throws Throwable {
	    
	   
	}
}
