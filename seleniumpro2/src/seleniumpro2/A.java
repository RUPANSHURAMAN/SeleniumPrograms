package seleniumpro2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	static WebDriver driver;
	static String browserName = "firefox"; 
	public static void main(String[] args) {
		if(browserName.equals("edge")){
			driver = new EdgeDriver();
		}else if(browserName.equals("firefox")){
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.gmail.com");
	}

}
