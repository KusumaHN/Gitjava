package Basics;

import org.openqa.selenium.chrome.ChromeDriver;


public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.close();
	}

}
