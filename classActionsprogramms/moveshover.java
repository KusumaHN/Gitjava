package classActionsprogramms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveshover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.puma.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement m = driver.findElement(By.xpath("(//a[@class='digimeg-nav-item'])[6]"));
		Actions act = new Actions(driver);
		act.moveToElement(m).perform();
		driver.findElement(By.xpath("(//a[.='Women'])[3]")).click();

	}

}
