package com.simplilearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpathCssSelector {

	public static void main(String[] args) {
//		Declare path of the driver
		String path = "G:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
//		Initiate the driver
		WebDriver driver = new ChromeDriver();
		
//		setting up the base_url
		String base_url = "http://www.facebook.com";
		
//		launching google chrome
		driver.get(base_url);
		
		WebElement xpathEmail= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		xpathEmail.getAttribute("placeholder");
		System.out.println(xpathEmail.getAttribute("placeholder"));
		
		WebElement password = driver.findElement(By.cssSelector("#pass"));
		password.getAttribute("placeholder");
		System.out.println(password.getAttribute("placeholder"));
		
		xpathEmail.sendKeys("bikki@gmail.com");
//		email.submit();
		
		password.sendKeys("123@");
//		password.submit();
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
//		driver.close();
	}

}
