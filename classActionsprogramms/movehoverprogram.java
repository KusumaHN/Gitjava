package classActionsprogramms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movehoverprogram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.puma.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement men = driver.findElement(By.xpath("(//a[@href='https://in.puma.com/men.html'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(men).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.='New Arrivals'])[3]")).click();
		

	}

}
