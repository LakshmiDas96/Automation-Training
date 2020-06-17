package testScripts;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class RegressionTest extends TestHelper {
  //@Test
 public void verifyUserCanClickOnButton() {
	  HomePage homePage=new HomePage(driver);
	  homePage.clickButton();
	  Assert.assertTrue(homePage.isHomeButtonDisplayed());
  }
 // @Test
  public void verifyUserCanSelectDestination() {
	  HomePage homePage=new HomePage(driver);
	  homePage.clickButton();
	  homePage.selectLocation();
  }
 // @Test
  
  public void selectCheckInandcheckOut() {
	  HomePage homePage=new HomePage(driver);
	  homePage.clickButton();
	  homePage.clickDateIcon();
  }
  
  
  
}
