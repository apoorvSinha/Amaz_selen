package BaseClass_s;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Initiator {
	private WebDriver driver;
	public login lgn;

	public WebDriver inititateDriver() {
		if (driver == null) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--headless");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(opt);
			
		}
		return driver;
	}
	
	

}
