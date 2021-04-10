package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLighter {
	
	
	public void getHighLighter(WebDriver driver, WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;');", element);		
	}	

}
