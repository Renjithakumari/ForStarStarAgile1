package com.CRM.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;

public class HomePageTestcases extends BaseClass {
  @Test(priority=1)
  public void vrifyUrl() {
	  String actualUrl=hp.getAppUrl();
	  Assert.assertTrue(actualUrl.contains("crm"),"Test failed: Url not matched");
	  System.out.println("Test passed: Url matched");
  }
  
  @Test(priority=2)
  public void vrifyTitle() {
	  String actualTitle=hp.getAppTitle();
	  Assert.assertTrue(actualTitle.contains("Customer"),"Test failed: Title is not matched");
	  System.out.println("Test passed: Title is matched");
  }
  
  @Test(priority=3)
  public void validateSighinLink() {
	  String nextPageUrl=hp.getStatusOfLink();
	  Assert.assertTrue(nextPageUrl.contains("login"),"Test failed: Login page not open");
	  System.out.println("Test Passed! Application vavigate to login page");
  }
  
}
