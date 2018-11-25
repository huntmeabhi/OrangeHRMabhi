package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static void main(String[] args) {
		ObjectRepository Obj = new ObjectRepository();
		Driver d = new Driver();
		WebDriver driver = d.init();
		driver.findElement(Obj.Username()).sendKeys("Admin");
		driver.findElement(Obj.Password()).sendKeys("admin123");
		driver.findElement(Obj.Login()).click();
		driver.quit();
		
	}

}
