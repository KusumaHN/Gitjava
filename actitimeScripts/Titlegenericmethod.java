package actitimeScripts;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlegenericmethod {
	
	public static void verifyPagebyTitle(WebDriver driver, String Title){
		try{
			String ExpTitle =Title;
			String ActTitle = driver.getTitle();
			if(ExpTitle.equals(ActTitle)){
				System.out.println("Pass- Required page opened with correct Title");
			}else{
				System.out.println("Fail- Required page not opened with correct Title");
			}	
		}catch(NoSuchElementException e)
		{
			System.out.println("Element is not present in the source code");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "./Software/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		verifyPagebyTitle(driver, "actiTIME - Login");
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text() ='Login ']")).click();
		Thread.sleep(5000);
		verifyPagebyTitle(driver, "actiTIME - Enter Time-Track");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		Thread.sleep(5000); 
		verifyPagebyTitle(driver, "actiTIME - Open Tasks");
		driver.close();
	}

}
