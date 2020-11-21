package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class css {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//WebDriver driver= new FirefoxDriver();
		
		driver.get("file:///F:/HTML%20files/script1.html");
		
		WebElement un= driver.findElement(By.cssSelector("input[type='text']"));
		
		un.sendKeys("xyz");
		Thread.sleep(2000);
		
		WebElement pw = driver.findElement(By.cssSelector("input[type='password']"));
		
				pw.sendKeys("abc");
		
		driver.close();
	}
}

