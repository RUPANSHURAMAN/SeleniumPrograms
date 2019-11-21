package seleniumpro9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.fb.com");
		
		WebElement target = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
		
		Actions a = builder.moveToElement(target).doubleClick();
		
		a.perform();
	}

}
