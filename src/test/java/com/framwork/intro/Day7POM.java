package com.framwork.intro;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Day7POM extends Day4Base {

	public Day7POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBys({ 
	@FindBy(id = "email"), 
	@FindBy(xpath = "(//input[contains(@class,'inputtext')])[1]") })
	private List<WebElement> txtUserName;

	@FindAll({
	@FindBy(id = "pass"), 
	@FindBy(id = "456789") })
	private List<WebElement> txtPassword;

	@FindBy(name = "login")
	private WebElement btnLogin;

	@FindBy(xpath = "//input[contains(@class,'inputtext')]")
	private List<WebElement> lstTxtValues;

	public List<WebElement> getLstTxtValues() {
		return lstTxtValues;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public List<WebElement> getTxtUserName() {
		return txtUserName;
	}

	public List<WebElement> getTxtPassword() {
		return txtPassword;
	}
}
