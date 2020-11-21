package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxs4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/HTML%20files/4checkboxs.html");
		          List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		          for(WebElement checkbox : allcheckbox)
		          {
		        	  checkbox.click();
		          }
	}

}
