package com.info;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends LibGlobal {

	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="hotelName")
	private WebElement hotelName;
	
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(name="room_type")
	private WebElement room_type;
	
	@FindBy(name="arrival_date")
	private WebElement arrival_date;
	
	@FindBy(name="departure_date")
	private WebElement departure_date;
	
	@FindBy(name="total_rooms")
	private WebElement total_rooms;
	
	@FindBy(name="adults_room")
	private WebElement adults_room;
	
	@FindBy(name="children_room")
	private WebElement children_room;
	
	@FindBy(name="price_night")
	private WebElement price_night;
	
	@FindBy(name="totel_price")
	private WebElement total_price;
	
	@FindBy(name="gst")
	private WebElement gst;
	
	@FindBy(name="final_price")
	private WebElement final_price;
	
	@FindBy(name="first_name")
	private WebElement first_name;
	
	@FindBy(name="last_name")
	private WebElement last_name;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="order_no")
	private WebElement order_no;
	
	@FindBy(name="logout")
	private WebElement logout;
	
	public WebElement getHotelName() {
		return hotelName;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getArrival_date() {
		return arrival_date;
	}
	public WebElement getDeparture_date() {
		return departure_date;
	}
	public WebElement getTotal_rooms() {
		return total_rooms;
	}
	public WebElement getAdults_room() {
		return adults_room;
	}
	public WebElement getChildren_room() {
		return children_room;
	}
	public WebElement getPrice_night() {
		return price_night;
	}
	public WebElement getTotal_price() {
		return total_price;
	}
	public WebElement getGst() {
		return gst;
	}
	public WebElement getFinal_price() {
		return final_price;
	}
	public WebElement getFirst_name() {
		return first_name;
	}
	public WebElement getLast_name() {
		return last_name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getOrder_no() {
		return order_no;
	}
	public WebElement getLogout() {
		return logout;
	}
	
	
	
}



