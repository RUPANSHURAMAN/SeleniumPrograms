package seleniumpro7;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class A {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		
		WebElement usernameField = driver.findElement(By.xpath("//*[@id='identifierId']"));
		usernameField.sendKeys("pankaj");
		
		Thread.sleep(2000);
		usernameField.clear();
		
		Thread.sleep(2000);
		System.out.println(usernameField.isEnabled());
		
		Thread.sleep(2000);
		System.out.println(usernameField.isDisplayed());
		
		File screenshotFile = driver.getScreenshotAs(OutputType.FILE);
		
		Files.copy(screenshotFile, new File("h:\\screenshot.png"));
	}
}
