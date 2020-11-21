package classActionsprogramms;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class programRobotclass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.puma.com/");
		Robot r1 = new Robot();
		
		r1.keyPress(KeyEvent.VK_ALT);
		r1.keyPress(KeyEvent.VK_SPACE);
		r1.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.close();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

		
		

	}
	

}
