package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;
	public  RegistrationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath="//input[@id='inputFirstName']")
WebElement firstName;
@FindBy(xpath="//input[@id='inputLastName']")
WebElement lastName;
@FindBy(xpath="//input[@id='inputEmail']")
WebElement email; 
@FindBy(xpath="//input[@id='inputPhone]")
WebElement phNO;
@FindBy(xpath="//input[@id='inputNewPassword1']")
WebElement password;
@FindBy(xpath="//input[@id='inputNewPassword2']")
WebElement cnfrmPassword;
@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
WebElement captcha;
@FindBy(xpath="//input[@class='btn btn-large btn-primary btn-recaptcha']")
WebElement registerbutton;
public void fillRegistrationPage() {
	firstName.sendKeys("Anu");
	lastName.sendKeys("P");
	email.sendKeys("abc@gmail.com");
	phNO.sendKeys("13432143");
	password.sendKeys("qwert12");
	cnfrmPassword.sendKeys("qwert12");
	captcha.click();
	registerbutton.click();
}
}
