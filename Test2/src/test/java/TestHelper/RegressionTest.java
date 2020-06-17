package TestHelper;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.RegistrationPage;

public class RegressionTest extends testHelper {
 // @Test
  public void verifyUserCanLogin() {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.clickOnLogin();
  }
  //@Test
  public void verifyUserCanClickOnRegister() {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.clickOnLogin();
	  loginPage.clickOnRegister();
  }
  @Test
  public void verifyUserCanFillRegistration() {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.clickOnLogin();
	  loginPage.clickOnRegister();
	  RegistrationPage register=new RegistrationPage(driver);
	  register.fillRegistrationPage();
  }
}