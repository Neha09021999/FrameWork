package com.nxzsound.webpages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage extends WebBase {
	
	
	
	

	@FindBy(xpath = "//div[@class=\"ant-col\"][1]")
	private WebElement ClickOnSignupButton;
	
	@FindBy(xpath = "//div[@class=\"MuiGrid-root subscription-list-acc MuiGrid-item MuiGrid-zeroMinWidth MuiGrid-grid-xs-8\"][2]")
	private WebElement ClickonCreativeType;
	
	@FindBy(xpath ="//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-8 MuiGrid-grid-sm-6\"]")
	private WebElement ClickOnNextButton;
	
	@FindBy(id = "basic_full_name")
	private WebElement EnterFullName;

	
	@FindBy(id ="basic_username")
	private WebElement EnterUsername;
	
	@FindBy(id ="basic_password")
	private WebElement EnterPassword;
	
	@FindBy (id ="basic_email")
	private WebElement EnterEmail;
	
	@FindBy (xpath = "//input[@class=\"form-control \"]" ) 	
	private WebElement EnterPhone;
	
	@FindBy(id="basic_instagram")
	private WebElement EnterInstagram;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement ClickOnNext1button;
	
	
	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Signupbutton() {
		ClickOnSignupButton.click();
	}
	
	public void creativetype() {
		try {
			ClickonCreativeType.click();
		}catch (Exception e) {
			Assert.fail("Veridy the signup page open with listener and creative option");
		}
	}
	
	public void verifysignup() {
		Assert.assertEquals(driver.getTitle(), "NXZSound10");
	}
	
	
	
    public void next() {
    	ClickOnNextButton.click();
    }
    
    public void enterdetails(String fullname,String username,String password ,String email,String phone1 ,String instagram) {
    	EnterFullName.click();
    	EnterFullName.sendKeys(fullname);
    	EnterUsername.click();
    	EnterUsername.sendKeys(username);
    	EnterPassword.click();
    	EnterPassword.sendKeys(password);
    	EnterPhone.click();
    	EnterPhone.clear();
    	EnterPhone.sendKeys(phone1);
    	EnterInstagram.click();
    	EnterInstagram.sendKeys(instagram);
	}
    
    public void Nexyt1() {
		try {
			ClickOnNext1button.click();
		}catch (Exception e) {
			Assert.fail("unable to signup ");
		}
	}
	
	public void verifysignup1() {
		Assert.assertEquals(driver.getTitle(), "NXZSound10");
	}

	public void enterinvaliddetails(String fullname1,String username1,String password1 ,String email1,String phone2 ,String instagram1) {
    	EnterFullName.click();
    	EnterFullName.sendKeys(fullname1);
    	EnterUsername.click();
    	EnterUsername.sendKeys(username1);
    	EnterPassword.click();
    	EnterPassword.sendKeys(password1);
    	EnterPhone.click();
    	EnterPhone.clear();
    	EnterPhone.sendKeys(phone2);
    	EnterInstagram.click();
    	EnterInstagram.sendKeys(instagram1);
	}

	

	
	
}
