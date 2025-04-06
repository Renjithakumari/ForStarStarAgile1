package com.CRM.Testcases;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTestcases extends BaseClass {
	
 @BeforeClass
 public void pageSetup() {
	 hp.getStatusOfLink();
 }
  @Test
  public void validateLogin() {
  String url=lp.doLogin("test@gmail.com", "test123");
  Assert.assertTrue(url.contains("customers"),"Test Failed : Login is not completed");
  System.out.println("Test Pass: Login completed!");
  }
}
