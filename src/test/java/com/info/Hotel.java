package com.info;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hotel extends LibGlobal {
      
	

	public static void main(String[] args) throws InterruptedException, IOException  {
	
     
     

	
	
	SelectHotel sh = new SelectHotel();
	BookHotel bh = new BookHotel();
	BookingConfirmation bc=new BookingConfirmation();
	
	
	
	
	
	
		browserConfig();
	  	openUrl("https://adactinhotelapp.com");
	  	HotelLogin h = new HotelLogin();
	  	Hotel e = new Hotel();
		type(h.getTxtId(),e.excelRead("C:\\Users\\girid\\eclipse-workspace1\\Goal\\excel\\hotel.xlsx","Sheet1",2, 1));
		type(h.getTxtPass(),"12345678");
		click(h.getBtnlog());
		
		SearchHotel s = new SearchHotel();
		optSelectVisibleText(s.getLoc(),"London");
		optSelectIndex(s.getHotel(),3);
		click(s.getRoomType());
		optSelectValue(s.getRoomType(),"3" );
		click(s.getRoomNum());
		optSelectValue(s.getRoomNum(),"3");
		click(s.getRoomType());
		optSelectValue(s.getRoomNum(), "3");
		click(s.getCheckInDate());
		type(s.getCheckInDate(), "05/12/2021");
		click(s.getCheckOutDate());
		type(s.getCheckOutDate(), "06/12/2021");
		optSelectValue(s.getAdultRoom(), "2");
		optSelectValue(s.getChild(), "child");
		click(s.getSearch());
		
		click(sh.getRadioBtn());
		click(sh.getContinueBtn());
		
		type(bh.getFirstName(), e.excelRead("C:\\Users\\girid\\eclipse-workspace1\\Goal\\excel\\hotel.xlsx","Sheet1",7, 1));
		type(bh.getLastName(), e.excelRead("C:\\Users\\girid\\eclipse-workspace1\\Goal\\excel\\hotel.xlsx","Sheet1",8, 1));
		type(bh.getAddress(), e.excelRead("C:\\Users\\girid\\eclipse-workspace1\\Goal\\excel\\hotel.xlsx","Sheet1",9, 1));
		type(bh.getCcNo(),  e.excelRead("C:\\Users\\girid\\eclipse-workspace1\\Goal\\excel\\hotel.xlsx","Sheet1",14, 1));
		optSelectValue(bh.getCcExpM(), "4");
		optSelectValue(bh.getCcExpY(), "2022");
		type(bh.getCcvNo(), e.excelRead("C:\\Users\\girid\\eclipse-workspace1\\Goal\\excel\\hotel.xlsx","Sheet1",15, 1));
		click(bh.getBookNow());
		view(bc.getOrder_no());
		view(bc.getFinal_price());
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Employee e =new Employee();
		
		
		e.browserConfig();
		
		e.openUrl("https://adactinhotelapp.com/");
		WebElement txtId = e.byId("username");
		
	
		
	    e.type(txtId, e.excelRead("C:\\Users\\girid\\eclipse-workspace1\\Goal\\excel\\hotel.xlsx","Sheet1", 2, 1));
		
		WebElement txtPass = e.byId("password");
		
		e.type(txtPass,e.excelRead("C:\\Users\\girid\\eclipse-workspace1\\Goal\\excel\\hotel.xlsx","Sheet1", 3, 1));
		WebElement btnlog = e.byId("login");
		e.click(btnlog);
		
		WebElement loc = e.byId("location");
		e.optSelectIndex(loc, 8);
		WebElement hotel = e.byId("hotels");
		e.optSelectIndex(hotel, 3);
		Thread.sleep(3000);
	

		WebElement roomType = e.byXpath("//option[text()='Double']");
		e.click(roomType);
		e.optSelectValue(roomType,"Double");
		
		
		WebElement roomNum = e.byXpath("//select[@id='room_nos']");
		e.click(roomNum);
		e.optSelectValue(roomNum, "3");
	
		WebElement checkInDate = e.byId("datepick_in");
		e.click(checkInDate);
		e.type(checkInDate, "02/12/2021");
		
		WebElement checkOutDate = e.byId("datepick_out");
		e.click(checkOutDate);
		e.type(checkOutDate, "04/12/2021");
		
		WebElement adultRoom = e.byId("adult_room");
		e.click(adultRoom);
		e.optSelectValue(adultRoom, "2");
		
		WebElement child = e.byId("child_room");
		e.click(child);
		e.optSelectValue(child, "child");
		
		WebElement search = e.byId("Submit");
		e.click(search);
		
		WebElement radioBtn = e.byId("radiobutton_0");
		e.click(radioBtn);
		
		WebElement continueBtn = e.byId("continue");
		e.click(continueBtn);
		
		WebElement firstName = e.byId("first_name");
		e.type(firstName, "Giridhan");
		
		WebElement lastName = e.byId("last_name");
		e.type(lastName, "Sugumar");		
		
		WebElement adr = e.byId("address");
		e.type(adr, "No.27 south car street, Veeramptiinam,Puducherry-605007");
		
		WebElement ccNo = e.byId("cc_num");
		e.type(ccNo, "6841539475369845");
		
		WebElement ccType = e.byId("cc_type");
		e.click(ccType);
		e.optSelectValue(ccType, "VISA");
		
		WebElement ccExpM = e.byId("cc_exp_month");
		e.click(ccExpM);
		e.optSelectValue(ccExpM, "3");
		
		WebElement ccExpY = e.byId("cc_exp_year");
		e.click(ccExpY);
		e.optSelectValue(ccExpY, "2022");
		
		WebElement ccvNo = e.byId("cc_cvv");
		e.click(ccvNo);
		e.type(ccvNo, "275");
		
		WebElement bookNow = e.byId("book_now");
		e.click(bookNow);
		*/
		
	}
}