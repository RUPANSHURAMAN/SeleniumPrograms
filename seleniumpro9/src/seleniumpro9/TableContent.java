package seleniumpro9;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TableContent {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Raman/selenium_workspace/seleniumpro9/src/seleniumpro9/Table.html");
		
		WebElement webElement = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]"));
		
		System.out.println(webElement.getText());
		Actions builder = new Actions(driver);
		
		Actions a = builder.moveToElement(webElement).doubleClick();
		
		a.perform();
		
	}
	

}
