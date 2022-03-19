package StepDefs;

import org.openqa.selenium.WebDriver;

import BaseClass_s.Initiator;
import PageObject.login;
import io.cucumber.java.en.*;


public class loginSteps extends Initiator {
		
		@Given("User is on Homepage")
		public void user_is_on_amazon_homepage() {
			WebDriver driver = inititateDriver();
			lgn = new login(driver);
			driver.get("https://www.flipkart.com/");
			
		}

		@Then("User Click on login button")
		public void user_click_on_login_button() {
			lgn.ClickLoginBtn();
		}
		

		@Then("User enters {string} and {string}")
		public void user_enters_and(String email, String password) {
			lgn.EnterEmail(email);
			lgn.EnterPassword(password);
		}


		@Then("User clicks on login button")
		public void user_clicks_on_login_button() {
			lgn.ClickLoginBtn();
		}



}
