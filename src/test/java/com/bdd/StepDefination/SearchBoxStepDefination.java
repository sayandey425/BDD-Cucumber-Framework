package com.bdd.StepDefination;
import org.openqa.selenium.Keys;

import com.bdd.pageobject.SearchBox;
import com.bdd.uistore.ContactusStore;

import Reusable.BaseCases;
import Reusable.Resource;
import io.cucumber.java.en_lol.WEN;
import io.cucumber.java.en_old.Tha;

public class SearchBoxStepDefination extends Resource {
	
	ContactusStore ct = new ContactusStore();
	BaseCases bc = new BaseCases();
	SearchBox sb = new SearchBox();
    
	
	@WEN("^User Type \"([^\"]*)\"$")
	public void user_Type(String arg1) throws Throwable {
	    
		sb.clickonSearchbox(driver);
		driver.findElement(ContactusStore.searchbox).sendKeys(arg1);
		
	}

	@WEN("^Select Birthday gift for men form the dropdown$")
	public void select_Birthday_gift_for_men_form_the_dropdown() throws Throwable {
		
		driver.findElement(ContactusStore.searchbox).sendKeys(Keys.ENTER);
	    
	}

	@Tha("^New page with gift for men will open which will contain -Birthday gifts for men text$")
	public void new_page_with_gift_for_men_will_open_which_will_contain_Birthday_gifts_for_men_text() throws Throwable {
	    
        String mgifts = driver.findElement(ContactusStore.men_gifts).getText();
		
		if(mgifts.equalsIgnoreCase("Birthday gifts for men"))
		{
			logger.info("User on correct page");
			System.out.println("Scenario : verify search box is functionality  Succefull ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("\n");
			
		}
	}


}
