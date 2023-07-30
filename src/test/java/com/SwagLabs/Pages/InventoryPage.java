package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage 
{
	private WebDriver driver;
	
	public InventoryPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//locators
	private By pList = By.xpath("//div[@class='inventory_item_name']");
	private By addCartBtn = By.id("add-to-cart-sauce-labs-fleece-jacket");
	
	
	
	//Actions
	public void getProductList()
	{
		List<WebElement> plist = driver.findElements(pList);
		System.out.println(plist.size());
		
		
		for(WebElement i:plist)
		{
			try {
			System.out.println(i.getText());
			
			if(i.getText().equals("Sauce Labs Fleece Jacket"))
			{
				i.click();
			}
			}catch(StaleElementReferenceException s)
			{

				List<WebElement> plist1 = driver.findElements(pList);
				
				for(WebElement j:plist1)
				{
					if(j.getText().contains("Sauce Labs Fleece Jacket"))
					{
						i.click();
						//driver.findElement(product).click();
						
						System.out.println("Product is added to the cart!");
						
					}
				}
				
				
				
				
			}
		}	
		
	}
	
	public void addPrToCart()
	{
		driver.findElement(addCartBtn).click();
	}
	
	
	
	
//	System.out.println(i.getText());
//	
//	if(i.getText().equals("Sauce Labs Fleece Jacket"))
//	{
//		i.click();
//	}
	
	
	
	
	
}
