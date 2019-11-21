import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://login.salesforce.com/?locale=eu");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("rupan");
		
		WebElement password = driver.findElement(By.name("pw"));
		password.sendKeys("raman");
		
		WebElement loginButton = driver.findElement(By.id("Login"));
		loginButton.click();
		
		
	}
}
