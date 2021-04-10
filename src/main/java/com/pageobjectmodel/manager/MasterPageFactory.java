package com.pageobjectmodel.manager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPageFactory {

	@FindBy(xpath="//*[@id='email']")
	private WebElement email;
	@FindBy(xpath="//*[@id='pass']")
	private WebElement pass;
	
	@FindBy(xpath="//*[@name='login']")
	private WebElement loginbtn;
	
	
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	


}
