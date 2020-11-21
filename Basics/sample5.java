package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class sample5 {

	public static void main(String[] args) {
		String chromekey="webdriver.chrome.driver";
		String chromevalue="./Software/chromedriver.exe";
		System.setProperty(chromekey, chromevalue);
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///F:/HTML%20files/Sample.html");
		
		String aTitle = driver.getTitle();
		System.out.println(aTitle);
		
		driver.close();
		
	}

}
