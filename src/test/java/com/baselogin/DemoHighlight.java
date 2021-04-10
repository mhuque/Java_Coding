package com.baselogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageobjectmodel.manager.MasterPageFactory;
import com.util.BaseConfig;
import com.util.HighLighter;
import com.util.ScreenShot;

public class DemoHighlight {

	
	public static void main(String[] args) throws Exception {
			
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BaseConfig.getConfigValue("URL"));
		//1st Screenshot
		ScreenShot.getScreenShot(driver, "homepage");
		
		//WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		MasterPageFactory pf = new MasterPageFactory();
		WebElement email = pf.getEmail();
		
		new HighLighter().getHighLighter(driver, email);
		email.sendKeys(BaseConfig.getConfigValue("user"));			
		WebElement password = driver.findElement(By.xpath("//*[@id='pass']"));
		new HighLighter().getHighLighter(driver, password);	
		password.sendKeys(BaseConfig.getConfigValue("pass"));			
		WebElement loginBtn = driver.findElement(By.xpath("//*[@name='login']"));
		new HighLighter().getHighLighter(driver, loginBtn);
		//2nd Screenshot
		ScreenShot.getScreenShot(driver, "loginpage");
		loginBtn.click();
		
		ScreenShot.getScreenShot(driver, "After login");
		
	}

}
