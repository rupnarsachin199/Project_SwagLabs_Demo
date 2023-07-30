package com.SwagLabs.Tests;

import org.testng.annotations.Test;

public class InventoryTest extends BaseClass
{
  @Test(priority=1)
  public void verifyProductList() 
  {
	  ip.getProductList();
  }
  
  @Test(priority=2)
  public void verifyAddPrToCart()
  {
	  ip.addPrToCart();
  }
}
