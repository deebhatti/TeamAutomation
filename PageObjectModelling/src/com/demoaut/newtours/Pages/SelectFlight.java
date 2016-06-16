package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
private WebDriver driver;
	
	@FindBy(css = "input[value='Blue Skies Airlines$361$271$7:10']")
	@CacheLookup
	private WebElement Depart;
	
	@FindBy(name = "reserveFlights")
	@CacheLookup
	private WebElement Continue;
	
	public SelectFlight(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void flightSelector(){
		Depart.click();
		Continue.click();
	}

}
