package steps_defination;

import org.openqa.selenium.WebElement;

import com.nxzsound.webpages.SignupPage;
import com.nxzsound.webpages.WebBase;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Signuppage extends WebBase {
	
	SignupPage signuppage =  new SignupPage();
	
	
	@When("User click on signup button")
	public void user_click_on_signup_button() {
	  signuppage.Signupbutton();
	}

	@Then("Verify that signup page should be open and creative and listener option is visible")
	public void verify_that_signup_page_should_be_open_and_creative_and_listener_option_is_visible() {
		signuppage.verifysignup();
	}
	
	@Then("Click on creative option")
	public void click_on_creative_option() {
	   signuppage.creativetype();
	}
	
	@Then("Click on next button")
	public void click_on_next_button() {
	 signuppage.next();
	}
	

	@Then("Add all the Valid details on fields {string} , {string} , {string} , {string} , {string} , {string}")
	public void add_all_the_valid_details_on_fields(String string, String string2, String string3, String string4, String string5, String string6) {
	    
		signuppage.enterdetails(string, string2, string3, string4, string5, string6);
	}
	
	@Then("Click on next1 button")
	public void click_on_next1_button() {
	 signuppage.Nexyt1();
	}


	@Then("Verify the signup {string}")
	public void verify_the_signup(String string) {
	 signuppage.verifysignup1();
	}
	
	@Then("Add all the inValid details on fields {string} , {string} , {string} , {string} , {string} , {string}")
	public void add_all_the_in_valid_details_on_fields(String string, String string2, String string3, String string4, String string5, String string6) {
	    signuppage.enterinvaliddetails(string, string2, string3, string4, string5, string6);
	}


}
