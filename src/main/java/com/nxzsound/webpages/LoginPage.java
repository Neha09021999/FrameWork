package com.nxzsound.webpages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends WebBase {
	
	
	@FindBy(id="loginBtn")
	private WebElement loginButton;
	
	@FindBy(id="basic_username")
	private WebElement EnterUsername;
	
	@FindBy(id="basic_password")
	private WebElement EnterPassword;
	
	@FindBy(xpath = "//button[@class=\"ant-btn ant-btn-primary red_custom_btn login_btn mt-1 login_btn_nxz\"]")
	private WebElement ClickonloginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnloginButton( ) {
		try {
			loginButton.click();
		} catch (Exception e) {
			Assert.fail("unable to Click on login Button");
		}
	}
	
	public void verifyloginPage() {
		Assert.assertEquals(driver.getTitle(), "NXZSound10");	
	}
	
	public void enterdetails(String Username,String Password) {
		EnterUsername.click();
		EnterUsername.sendKeys(Username);
		EnterPassword.click();
		EnterPassword.sendKeys(Password);
		
	}
	
	
	public void loginbutton()
	{
		ClickonloginButton.click();
	}
	
	public void Homepage() {
		try {
			ClickonloginButton.click();
		}catch (Exception e) {
			Assert.fail("unable to Click on next Button");
		}
	}
	
	public void verifyhomepage() {
		Assert.assertEquals(driver.getTitle(), "NXZSound10");	
	}
	
	
	public void EnterinvalidDetails(String username , String password) {
		EnterUsername.click();
		EnterUsername.sendKeys(username);
		EnterPassword.click();
		EnterPassword.sendKeys(password);
	}
	
		

	
	
}
