package actitimeScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://localhost/login.do");
		 
		 String ExpURL = "http://localhost/login.do";
		 String ActURL = driver.getCurrentUrl();
		 
		 if(ActURL.contains(ExpURL))
		 {
			 System.out.println("Pass- Required page opened with correct URL");
		 }
		 
		 else{
			 System.out.println("Fail- Required page is not opened with correct URL");
		 }

	}

}
