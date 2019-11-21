package com.seleniumpro5.selenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadPhoto {
	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.quikr.com/Escrow/post-classifieds-ads/?postadcategoryid=1388");
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div/div/table/tbody/tr/td[2]/div/div[2]/div[2]/div[1]/div[3]/div/div[2]/div[1]/label")).click();
		
		Robot robot = new Robot();
		
		Thread.sleep(2000);
		
		/*robot.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		*/
		
		//Ctrl + c
		StringSelection s = new StringSelection("nokia.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		//Ctrl + v
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
}
