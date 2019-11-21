package seleniumpro4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Raman/selenium_workspace/seleniumpro5/src/com/seleniumpro5/selenium/NewFile.html");
		
		WebElement we = driver.findElement(By.xpath("/html/body/select"));
		
		Select s = new Select(we);
		s.selectByIndex(2);
		s.selectByValue("saab");
	}

}
