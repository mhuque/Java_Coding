package com.baselogin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	
	
	public static void main(String[] args) {
		
		//to open a browser
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //up casting = Interface taking help form class
		//driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//navigate has extra function like to, back, forward but get has no special function
		//driver.navigate().to("https://google.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		//email xpath //*[@id='email']
		
		// Highlight the email using JavaScriptExecutor (Interface taking help form class = upcasting)
		
		
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		
			
		JavascriptExecutor js = (JavascriptExecutor) driver; //type casting- 2 different things we are 
		//attaching to the object
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;');", email);
		//js.executeScript("arguments[0].style.border='4px groove red'", email);
		email.sendKeys("thisismytest5500@gmail.com");
		//password xpath //*[@id='pass']
		
		
		// Highlight the password
		
		WebElement password = driver.findElement(By.xpath("//*[@id='pass']"));
		password.sendKeys("Hello90!");
			
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;');", password);
		
		
		
		//login button xpath
		
		
		// Highlight the login button
		
		
		WebElement loginBtn = driver.findElement(By.xpath("//*[@name='login']"));
		loginBtn.click();
		
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid red;');", loginBtn);
		
	}

}
