package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainclass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		LoginPage l1 = new LoginPage(driver);
		l1.setun("admin");
		Thread.sleep(1000);
		l1.setpw("manager");
		l1.clickLogin();
		
driver.close();
	}

}
