package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Googlepage;

public class TestGooglepage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Googlepage g1= new Googlepage(driver);
		g1.getlinkscount();
		g1.getTextofLinks();
		
		driver.close();

	}

}
