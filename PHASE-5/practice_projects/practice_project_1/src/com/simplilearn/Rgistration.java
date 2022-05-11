package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rgistration {

	
	public static void main(String[] args) {
		String path= "G:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		///initiate the driver
		WebDriver driver= new ChromeDriver();
		///step:2 base url
		String base_url= "https://www.shine.com/registration/parser/";
		///step:3 launching shine.com
		driver.get(base_url);
		
		WebElement name = driver.findElement(By.id("id_name"));
		name.sendKeys("Bikki Shaw");
		
		WebElement email = driver.findElement(By.id("id_email"));
		email.sendKeys("bikki1234@gmail.com");
		
		WebElement cell = driver.findElement(By.id("id_cell_phone"));
		cell.sendKeys("9287657867");
		
		WebElement pass = driver.findElement(By.id("id_password"));
		pass.sendKeys("Hello123@");
		
		WebElement register = driver.findElement(By.id("registerButton"));
		register.click();

	}
}