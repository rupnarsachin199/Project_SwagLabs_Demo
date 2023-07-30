package com.SwagLabs.Tests;

import org.testng.annotations.Test;

public class CheckoutTest extends BaseClass
{
  @Test(priority=1)
  public void verifyCheckout() 
  {
	  cp.checkout();
  }
  
  @Test(priority=2)
  public void verifyEnterData()
  {
	  cp.enterData("Sachin", "Rupnar", "431536");
  }
}
