package com.info;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SelectHotel extends LibGlobal{
	
	public void SelectHot() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_2")
	private WebElement radioBtn;
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	public WebElement getRadioBtn() {
		return radioBtn;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	
	
	
}
