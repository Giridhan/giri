package com.info;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends LibGlobal{

	public SearchHotel(){
	 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement loc;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(xpath="//option[text()='Double']")
	private WebElement roomType;
    
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
    
	@FindBy(id ="datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(xpath="select[@id='room_nos']")
	private WebElement roomNum;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	
	
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	
	public WebElement getRoomNum() {
		return roomNum;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChild() {
		return child;
	}
	
	public WebElement getSearch() {
		return search;
	}
	
	
	
	
	
}
