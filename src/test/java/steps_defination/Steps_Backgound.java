package steps_defination;

import com.nxzsound.webpages.WebBase;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;

public class Steps_Backgound {
	
	WebBase webBase = new WebBase();
	
	@Given("User open {string} browser and enter url {string}")
	public void user_open_browser_and_enter_url(String browser, String url) {
		webBase.OpenBrowser(browser);
		webBase.OpenWebsite(url);
	    
	}
	@After
	public void Closebrowser( ) {
		webBase.Closebrowser();
	}
	
	
	
	
	
	

}
