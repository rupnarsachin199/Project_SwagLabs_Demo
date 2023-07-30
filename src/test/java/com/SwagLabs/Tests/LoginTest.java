package com.SwagLabs.Tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass
{
  @Test
  public void verifyDologin() 
  {
	  lp.doLogin(p1.getData("userN"), p1.getData("passw"));
  }
}
