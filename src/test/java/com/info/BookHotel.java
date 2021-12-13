package com.info;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends LibGlobal{

	public BookHotel() {
		PageFactory.initElements(driver, this);

	}
  
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id ="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccNo;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement ccExpM;
	@FindBy(id="cc_exp_year")
	private WebElement ccExpY;
	@FindBy(id="cc_cvv")
	private WebElement ccvNo;
	@FindBy(id="book_now")
	private WebElement  bookNow;
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNo() {
		return ccNo;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcExpM() {
		return ccExpM;
	}
	public WebElement getCcExpY() {
		return ccExpY;
	}
	
	
	public WebElement getCcvNo() {
		return ccvNo;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	
	
	

}
