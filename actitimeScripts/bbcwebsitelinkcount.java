package actitimeScripts;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbcwebsitelinkcount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bbc.com/");
		
		 java.util. List<WebElement>   allLinks =   driver.findElements(By.xpath("//a"));
		 
		 System.out.println("Number of links = " + allLinks.size());
		 
		 for(WebElement link : allLinks)
		 {
			 String Text = link.getText();
			 
			 String URL = link.getAttribute("href");
			 
			 System.out.println(Text + "----->" + URL);
					 
		 }
		
	}

}
