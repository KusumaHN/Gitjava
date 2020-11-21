package actitimeScripts;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartlinkscount {

	public static void main(String[] args) throws InterruptedException {
	  
		
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	java.util.List <WebElement> allLinks = driver.findElements(By.xpath("//a"));
	
		System.out.println("Number of links =" + allLinks.size());
		Thread.sleep(5000);
		
		for (WebElement link : allLinks)
		{
			String text = link.getText();
			
			String Url = link.getAttribute("href");
			
			
		System.out.println(text + "-----------> "+ Url);
			
			
			
		}

	}

}
