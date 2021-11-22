package com.bdd.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions
               (
            	features = "Features"	,
            	glue = {"com.bdd.StepDefination"}
            	            		 
               )
public class TestRunner {

}
