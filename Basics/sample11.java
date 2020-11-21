package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample11 {
public static void main(String[] args) {
		
	String chromekey ="webdriver.chrome.driver";
	String chromevalue = "./Software/chromedriver.exe";
	System.setProperty(chromekey, chromevalue);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///F:/HTML%20files/sample3.html");
		
		WebElement link =driver.findElement(By.partialLinkText("go"));
		link.click();
		
		String ATitle = driver.getTitle();
		System.out.println(ATitle);
		driver.close();

	}

	
}
