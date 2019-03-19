package com.week6.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.automation.pages.Base;

public class CheckBoxTest extends Base {


	@Test(enabled =false)
	public void testing_Checkbox() {
		try {
		driver.get("https://www.coolfields.co.uk/2011/04/accessible-forms-checkboxes-and-radio-buttons/");
         
		WebElement checkboxElem = driver.findElement(By.id("pizza1"));
		checkboxElem.click();
		
		WebElement check2boxElem = driver.findElement(By.id("pizza2"));
		check2boxElem.click();
		Thread.sleep(5*1000);
		
		checkboxElem.click(); // uncheck the check box 1  
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Test (enabled =false)
	 public void tesing_radioBotton () {
		try {
		driver.get("https://www.coolfields.co.uk/2011/04/accessible-forms-checkboxes-and-radio-buttons/");
		WebElement radioBtm2 = driver.findElement(By.cssSelector("#age2"));
		radioBtm2.click();
		
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	@Test
	public void Testing_checkBox2() {
		driver.get("https://www.coolfields.co.uk/2011/04/accessible-forms-checkboxes-and-radio-buttons/");
		myLibrary.handleCheckBoxRadioBtn(By.id("pizza1"), true);
		
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

