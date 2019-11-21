package seleniumpro9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class VirtualTyping {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.fb.com");
		
		WebElement element = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
		
		Actions a = builder.moveToElement(element).sendKeys(element,"html");
		
		a.perform();
	}
}
