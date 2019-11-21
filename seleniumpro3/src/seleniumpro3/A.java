package seleniumpro3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://ddnews.gov.in/");
		List l = driver.findElements(By.tagName("img"));
		System.out.println(l.size());
	}

}
