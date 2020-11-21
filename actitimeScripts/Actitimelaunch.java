package actitimeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimelaunch {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text() ='Login ']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		
		Thread.sleep(5000);
driver.close();
	}

}