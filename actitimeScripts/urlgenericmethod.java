package actitimeScripts;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urlgenericmethod {
	public static void verifypagebyURL (WebDriver driver, String url) throws InterruptedException
	{
		try{
			String ExpURL = url;
			 String ActURL = driver.getCurrentUrl();	 
			 if(ActURL.contains(ExpURL))
			 {
				 System.out.println("Pass- Required page opened with correct URL");
			 } 
			 else{
				 System.out.println("Fail- Required page is not opened with correct URL");
			 }
	}catch(NoSuchElementException e){
		System.out.println("Element is not present in the source code");
	}
		}
	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "./Software/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		verifypagebyURL(driver, "http://localhost/login.do");
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text() ='Login ']")).click();
		Thread.sleep(5000);
		
		verifypagebyURL(driver, "http://localhost/user/submit_tt.do");
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		Thread.sleep(5000); 
		verifypagebyURL(driver, "http://localhost/tasks/otasklist.do");
		driver.close();
	}

}
