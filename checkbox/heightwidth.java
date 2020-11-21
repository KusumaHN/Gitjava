package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class heightwidth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement value = driver.findElement(By.xpath("//img[@src='/img/default/login/timer.gif?hash=1106883454']"));
		String h1 = value.getAttribute("height");
		System.out.println(h1);
		String w1 = value.getAttribute("width");
		System.out.println(w1);

	}

}
