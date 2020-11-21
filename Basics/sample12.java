package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample12 {
	
	public static void testBrowser(WebDriver driver){
		
		driver.get("file:///F:/HTML%20files/sample3.html");
		
		WebElement link = driver.findElement(By.id("d1"));
		link.click();
		driver.close();
		
				
	}

	public static void main(String[] args) {
		 String chromekey= "webdriver.chrome.driver";
		 String chromevalue= "./Software/chromedriver.exe";
		 System.setProperty(chromekey, chromevalue);
		 
		 WebDriver driver = new ChromeDriver();		
		 testBrowser(driver);
		 
	}

}
