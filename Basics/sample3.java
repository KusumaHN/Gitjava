package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.gmail.com/");

	}

}
