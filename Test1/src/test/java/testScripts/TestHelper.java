package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHelper {
	public WebDriver driver;
	  @BeforeMethod
	  
		  public void beforeMethod() {
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\Compaq\\Desktop\\last chromedriver\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.get("https://phptravels.com/demo/");
			  
			  driver.manage().window().maximize();
			// driver.switchTo().frame(iframe);
		  driver.close();
		  }
}
