package pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		Loginpage l1 = new Loginpage(driver);
		
		//invalid login
		l1.setun("123");
		l1.setpw("manager");
		l1.clickLogin();
		
		Thread.sleep(1000);
		
		//valid login
		l1.setun("admin");
		l1.setpw("manager");
		l1.clickLogin();
		
		driver.close();

	}

}
