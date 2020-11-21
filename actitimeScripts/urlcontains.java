package actitimeScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class urlcontains {


	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		String aURL = driver.getCurrentUrl();
		String eURL = "login.do";

		boolean result = aURL.contains(eURL);
		if (result==true)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
