package actitimeScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagetitle {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://localhost/login.do");
		 
		 String ExpTitle = "actiTIME - Login";
		 String ActTitle = driver.getTitle();
		 
		 if(ActTitle.equals(ExpTitle))
		 {
			 System.out.println("Pass- Required page opened");
		 }
		 
		 else{
			 System.out.println("Fail- Required page is not opened");
		 }

	}

}
