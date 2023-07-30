package com.SwagLabs.Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;
import com.Utility.*;


public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	public AddtoCart ap;
	public checkoutPage cp;
	public SummaryPage sp;
	public PropertiesFile p1;

	
	@BeforeTest
	public void browserSetup()
	{
		p1 = new PropertiesFile();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp = new LoginPage(driver);
		ip = new InventoryPage(driver);
		ap = new AddtoCart(driver);
		cp = new checkoutPage(driver);
		sp = new SummaryPage(driver);
		
	}
	
	
	@BeforeClass
	public void pageSetup()
	{
		lp.doLogin(p1.getData("userN"), p1.getData("passw"));
		ip.getProductList();
		ip.addPrToCart();
		ap.cartOpen();
		cp.checkout();
		cp.enterData("Sachin", "Rupnar", "431536");
	}
	
	
	@AfterClass
	public void tearDown()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	
}
