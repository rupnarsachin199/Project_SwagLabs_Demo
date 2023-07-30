package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class checkoutPage
{
	private WebDriver driver;
	
	public checkoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//locators
	private By checkoutBtn = By.id("checkout");
	private By firstName = By.id("first-name");
	private By lastName = By.id("last-name");
	private By zipCode = By.id("postal-code");
	private By cntBtn = By.id("continue");
	
	
	
	
	//Actions
	public void checkout()
	{
		driver.findElement(checkoutBtn).click();
	}
	
	public void enterData(String fname, String lname, String zcode)
	{
		driver.findElement(firstName).sendKeys(fname);
		driver.findElement(lastName).sendKeys(lname);
		driver.findElement(zipCode).sendKeys(zcode);
		
		
		
		//click on continue
		driver.findElement(cntBtn).click();
		
	}
	
	
	
	
	
	

}
