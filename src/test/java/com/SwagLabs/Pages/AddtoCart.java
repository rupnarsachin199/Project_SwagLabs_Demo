package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoCart 
{
	private WebDriver driver;
	
	public AddtoCart(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	//locators
	private By shopCartBtn = By.xpath("//a[@class='shopping_cart_link']");
	
	//Actions
	public void cartOpen()
	{
		driver.findElement(shopCartBtn).click();
	}
}
