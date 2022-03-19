package BaseClass_s;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Initiator {
	private WebDriver driver;
	public login lgn;

	public WebDriver inititateDriver() {
		if (driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	

}
