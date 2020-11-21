package actitimeScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alternatementhod {

	public static void main(String[] args) {
	
		
		String key = "webdriver.chrome.driver";
		String value = "./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		String actTitle = driver.getTitle();
		String expTitle = "actiTIME - Login";
		
		 				boolean result = actTitle.equals(expTitle);
		 				if(result==true)
		 				{
		 					System.out.println("Pass: Page is opened");
		 				}
		 				else
		 				{
		 					System.out.println("Fail: Page is not opened");
		 				}
		
		
	}
	

}
