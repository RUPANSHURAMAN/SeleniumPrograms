package seleniumpro9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpaths {
	
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.fb.com");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='u_0_o']"));
		
		System.out.println(element.getTagName());
		
		
	}

}
