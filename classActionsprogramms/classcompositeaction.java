package classActionsprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class classcompositeaction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement value = driver.findElement(By.xpath("//a[.='Actimind Inc.']"));
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).click().build().perform();

	}

}
