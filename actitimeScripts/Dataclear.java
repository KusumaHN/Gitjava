package actitimeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dataclear {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "./Software/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/HTML%20files/FNLNtextfield11.html");
		
		String title=driver.getTitle();
		System.out.println("Page Title is : " + title);
		
		String pagesrc=driver.getPageSource();
		System.out.println("Page Source is : " + pagesrc);
		
	WebElement FN = driver.findElement(By.xpath("//input[1]"));
		FN.sendKeys("Kusuma");
		
	WebElement LN = driver.findElement(By.xpath("//input[2]"));
		LN.sendKeys("Nagaraj");
		Thread.sleep(5000);
	
		FN.clear();
		LN.clear();

	}

}
