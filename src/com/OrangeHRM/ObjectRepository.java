package com.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ObjectRepository {
	
	
	public By Username (){
		return By.xpath("//*[@id='txtUsername']");
	}
	public By Password (){
		return By.xpath("//*[@id='txtPassword']");
	}
	public By Login (){
		return By.xpath("//*[@id='btnLogin']");
	}
	
			
}
