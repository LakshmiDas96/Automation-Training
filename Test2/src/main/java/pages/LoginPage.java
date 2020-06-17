package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class LoginPage   {
	WebDriver driver;
	
	   public  LoginPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
@FindBy(xpath="//a[@class='btn yx-nfn yx-njg']")
WebElement login;
@FindBy(xpath="//a[text()='Register']")
WebElement register;
public void clickOnLogin() {
	login.click();
}
public void clickOnRegister() {
	PageUtilities.waitforElementTobeClickable(driver, register, 5);
	Actions act=new Actions(driver);
	act.moveToElement(register);
	register.click();
}
}
