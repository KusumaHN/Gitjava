package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class valueofattributeplaceholder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/HTML%20files/placeholder.html");
		WebElement value = driver.findElement(By.xpath("//input[@type='textbox']"));
		String v1 = value.getAttribute("placeholder");
		System.out.println(v1);

	}

}
