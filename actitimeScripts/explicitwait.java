package actitimeScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://localhost/login.do");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebDriverWait wait = new WebDriverWait(driver,10);
		 System.out.println(driver.getTitle());
				 
		 WebElement UN = driver.findElement(By.xpath("//input[@id='username']"));
		UN.sendKeys("admin");
		
		WebElement PW = driver.findElement(By.xpath("//input[@name='pwd']"));
		PW.sendKeys("manager");
		
	
		WebElement loginbutton = driver.findElement(By.xpath("//div[.='Login ']"));
		loginbutton.click();
		
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		 System.out.println(driver.getTitle());
		 
		 WebElement logout= driver.findElement(By.xpath("//a[@id='logoutLink']"));
			logout.click();
		 
			wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
			
			 System.out.println(driver.getTitle());
			driver.close();
	}

}
