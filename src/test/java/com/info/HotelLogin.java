package com.info;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelLogin extends LibGlobal{
	
	public HotelLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtId;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(id="login")
	private WebElement btnlog;
	
	public WebElement getTxtId() {
		return txtId;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnlog() {
		return btnlog;
	}
	


	
	
	
	
	}
	
	
	
	
	


