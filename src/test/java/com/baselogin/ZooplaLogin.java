package com.baselogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZooplaLogin {
	
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.zoopla.co.uk/");
		
		driver.manage().window().maximize();
		
		WebElement cookies = driver.findElement(By.xpath("(//*[@type='button'])[2]"));
		cookies.click();
		
//		WebElement signIn = driver.findElement(By.xpath("(//*[@class='css-1irwa4a-ButtonLink-Button eaqu47p1'])[4]"));
//		signIn.click();
		
		WebElement signIn = driver.findElement(By.xpath("//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']"));
		signIn.click();
		
		WebElement email = driver.findElement(By.xpath("//*[@id='signin_email']"));
		email.sendKeys("hellotest@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id='signin_password']"));
		password.sendKeys("12345678H!");
		
		WebElement loginBtn = driver.findElement(By.xpath("//*[@class='button button--primary button--wide']"));
		loginBtn.click();
		
		
	}

}
