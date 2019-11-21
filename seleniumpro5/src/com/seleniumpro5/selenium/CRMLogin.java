package com.seleniumpro5.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRMLogin {

	public static void main(String[] args) throws Exception{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.zoho.in/signin?servicename=ZohoCRM&signupurl=https://www.zoho.com/crm/signup.html");
		
		//user
		driver.findElement(By.xpath("//*[@id='lid']")).sendKeys("rupanshuraman@hotmail.com");
		
		//pass
		driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys("Zoho@123");
		
		//login button
		driver.findElement(By.xpath("//*[@id='signin_submit']")).click();
		
		Thread.sleep(60000);
		driver.findElement(By.xpath("//*[@id='createIcon']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='submenu_Leads']")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='select2-Crm_Leads_FIRSTNAME_SALUTATION-container']")).click();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_ENTER);

	}
}
