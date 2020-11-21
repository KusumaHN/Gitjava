package actitimeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagesouceprogram {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./Software/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
	String pagesrc=	driver.getPageSource();
		System.out.println(pagesrc);
		WebElement UN = driver.findElement(By.xpath("//input[@id='username']"));
				UN.sendKeys("admin");
				

	}
	}
