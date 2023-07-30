package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//locators
	private By username = By.id("user-name");
	private By passwrod = By.id("password");
	private By lgBtn = By.id("login-button");
	
	
	//Actions
	
	public void doLogin(String un, String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(passwrod).sendKeys(psw);
		driver.findElement(lgBtn).click();
		
	}
}
