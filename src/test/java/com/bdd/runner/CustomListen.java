package com.bdd.runner;


import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.bdd.utility.TakeScreenShot;

import Reusable.BaseCases;
import Reusable.Resource;



	public  class CustomListen  extends Resource implements ITestListener {
		
		
		BaseCases bs = new BaseCases();
		TakeScreenShot ts = new TakeScreenShot();
		
	  public void onTestStart(ITestResult tr)
	  {
		  System.out.println("Test has started");
	  }
	  
	  
	  
	  
	  
	  public void onTestSuccess(ITestResult tr)
	  {
		  System.out.println("Test passed");
		  try {
			 TakeScreenShot.takeSnapShotonpass(tr.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	  }
	  
	  

	

	public void onTestFailure(ITestResult tr)
	  {
		  System.out.println("Test Failed");
		  try {
			TakeScreenShot.takeSnapShotonFail(tr.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
	  }
	  
	
	
	
	
	  public void onTestSkipped(ITestResult tr)
	  {
		  System.out.println("Test Skipped");
	  }





	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}





	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}





	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	}

	
	

