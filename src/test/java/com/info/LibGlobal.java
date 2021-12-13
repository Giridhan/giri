package com.info;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.AttributeSet;
import javax.swing.text.html.Option;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	 
	
	static WebDriver driver;
	
	public static void  browserConfig() {


		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	
	public static void openUrl(String url) {
		driver.get(url);
		
	}
	
	public  WebElement byId(String id) {
		
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	
	public  WebElement byName(String name) {
	 WebElement findElement = driver.findElement(By.name(name));
	return findElement;

	}
	
	public  WebElement byXpath(String xpathExpression) {
		WebElement findElement = driver.findElement(By.xpath(xpathExpression));
		return findElement;

	}
	
	public  static void type(WebElement element,String data) {
		element.sendKeys(data);

	}
	
	public static void click(WebElement element) {
		element.click();
		
		

	}
	
	public static void optSelectIndex(WebElement element,int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	public static void optDeSelectIndex(WebElement element,int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	public static void optSelectValue(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}
	
	public static void optSelectVisibleText(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}

	
	public String excelRead (String path ,String sheet,int row,int cell) throws IOException{
		File f= new File(path);
		FileInputStream filInp = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(filInp);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = null;
		
		int cellType = c.getCellType();
		
		if (cellType==1) {
			value = c.getStringCellValue();
			System.out.println(value);
			
			
		} else if (cellType==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd/mm/yyyy");
				value = sim.format(d);
				System.out.println(value);
				
			}
			
		} else {
			double numericCellValue = c.getNumericCellValue();
			
			long l = (long) numericCellValue;
			value = String.valueOf(l);
			System.out.println(value);
			
		} 
	
	
	return value;	
}


	public static void excelWrite(String path,String sheet,int row,int cell,String value) throws IOException {
			
		File file = new File(path);
		FileInputStream fin = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.createSheet(sheet);
		Row r = s.createRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(value);
		FileOutputStream foup = new FileOutputStream(file);
		w.write(foup);
		

		}
	

	public static  void view(WebElement element) {
		System.out.println(element);
	}


}	




