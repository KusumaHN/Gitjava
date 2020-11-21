package classActionsprogramms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class classcontextclick {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement value = driver.findElement(By.xpath("//a[.='Actimind Inc.']"));
		Actions act = new Actions(driver);
		act.contextClick(value).perform();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_W);

		
	}

}
