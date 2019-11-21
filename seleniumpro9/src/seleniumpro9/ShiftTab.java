package seleniumpro9;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ShiftTab {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.fb.com");
		
		WebElement element = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
		
		Actions a = builder.moveToElement(element).keyUp(element, KeyEvent.SHIFT_DOWN_MASK);
		
		a.perform();
	}
}
