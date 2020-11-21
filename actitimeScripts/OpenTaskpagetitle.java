package actitimeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTaskpagetitle {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text() ='Login ']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text() ='Tasks']")).click();
		
		String exptitle = "actiTIME - Open Tasks";
		String acttile = driver.getTitle();
		
		if (exptitle.equals(acttile))
		{
			System.out.println("Pass- Open-Tasks page opened");
		 }
		 
		 else{
			 System.out.println("Fail- Open-Tasks page is not opened");
		 }
		
	Thread.sleep(5000);
		
		driver.findElement(By.id("logoutLink")).click();

	}

}
