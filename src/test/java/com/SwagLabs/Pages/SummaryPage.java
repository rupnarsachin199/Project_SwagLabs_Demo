package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryPage 
{
	private WebDriver driver;
	
	public SummaryPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//locators
	private By summaryDetails = By.xpath("//div[@id='checkout_summary_container']");
	private By finishBtn = By.id("finish");
	private By heading = By.xpath("//h2[@class='complete-header']");
	
	
	//Actions
	public void getSummaryDetails()
	{
		System.out.println(driver.findElement(summaryDetails).getText());
		driver.findElement(finishBtn).click();
		System.out.println(driver.findElement(heading).getText());
	}
	
	
}
