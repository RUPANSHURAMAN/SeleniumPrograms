package seleniumpro8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.zoho.com/signin?servicename=ZohoCRM&signupurl=https://www.zoho.com/crm/signup.html");
		
		driver.findElement(By.xpath("//*[@id='lid']")).sendKeys("rupanshuraman@hotmail.com");
		driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys("Zoho@123");
		driver.findElement(By.xpath("//*[@id='signin_submit']")).click();
		
		Thread.sleep(60000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		WebElement we = links.get(0);
		int enabledLinksCount=0;
		
		for(WebElement link:links){
			if(link.isEnabled()){
				enabledLinksCount++;
			}
		}
		System.out.println("No. of links enabled: "+enabledLinksCount+" and no. of links disabled: "+(links.size()-enabledLinksCount));
		System.out.println(links);
		
	}

}
