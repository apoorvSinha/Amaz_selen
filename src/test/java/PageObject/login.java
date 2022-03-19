package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	public WebDriver ldriver;
	
	public login(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(linkText = "Login")
	WebElement login;
	
	//using full xpath due to unavailable fix class
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement Password;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement Email;
	@FindBy(xpath="//div[@class='_1D1L_j']//button")
	WebElement loginbtn;
	
	public void ClickLogin() {
		login.click();
	}
	public void EnterEmail(String email) {
		Email.sendKeys(email);
	}
	public void EnterPassword(String pwd) {
		Password.sendKeys(pwd);
	}
	public void ClickLoginBtn() {
		loginbtn.click();
	}
}
