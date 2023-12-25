package steps_defination;

import com.nxzsound.webpages.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Loginpage {
	
	LoginPage loginpage = new LoginPage();
	
	@When("User click on login button")
	public void user_click_on_login_button() {
	   loginpage.clickOnloginButton();
	}

	@Then("Verify that login page should be open")
	public void verify_that_login_page_should_be_open() {
		loginpage.verifyloginPage();
	}

	@Then("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		loginpage.enterdetails(string, string2);
	}

	@Then("User clicks on the next button")
	public void user_clicks_on_the_next_button() {
	    loginpage.loginbutton();
	}

	@Then("Verify the HomePage {string}")
	public void verify_the_home_page(String string) {
	   loginpage.Homepage();
	}

	@Then("User enters invalid details {string} and {string}")
	public void user_enters_invalid_details_and(String string, String string2) {
	   loginpage.EnterinvalidDetails(string, string2);
	}

}
