package com.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;

public class ScreenShot {
	
	public static void getScreenShot(WebDriver driver, String pictureName) throws IOException {
		File folder = new File("./target/Screen shot");
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file= ts.getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File( "./target/Screen shot/"+pictureName+".png"));
		 
	}
	
	

}
