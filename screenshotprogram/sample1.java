package screenshotprogram;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		Date d1 = new Date();
		String s1= d1.toString();
		String s2=s1.replaceAll(":", "_");
		System.out.println(s2);
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("Hi");
		Thread.sleep(2000);
			
		TakesScreenshot t1 = (TakesScreenshot) driver;
		     				
			File srcFile = t1.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Screenshots/screenshot"+s2+".png");
			
			FileUtils.copyFile(srcFile, destFile);
			
			driver.close();
			
		
	}

}
