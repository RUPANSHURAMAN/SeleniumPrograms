package seleniumpro1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathSelector {
	
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://mail.google.com");
		
		//By Xpath
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("rupanshuraman");
		
		//By .CSS selector
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("raman");
	}

}
