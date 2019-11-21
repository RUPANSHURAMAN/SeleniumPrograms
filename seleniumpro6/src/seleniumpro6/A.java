package seleniumpro6;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	public static void main(String[] args) throws Exception{
		//Managing multiple windows
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com");
		
		/* NOT OPENING
		 * Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[1]/div/ul[2]/li[2]/a")).click();*/
		
		
		Set noOfWindows = driver.getWindowHandles();
		Object[] obj1 = noOfWindows.toArray();
		driver.switchTo().window((String)obj1[2]);
		
		Thread.sleep(2000);
		driver.close();
	}

}
