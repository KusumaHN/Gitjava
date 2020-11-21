package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class componentimagernot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement component = driver.findElement(By.xpath("//img[@src='/img/default/login/timer.gif?hash=1106883454']"));
		String tag = component.getTagName();
		if(tag.equals("img")){
			System.out.println("component is a image");
		}else{
			System.out.println("component is not a image");
		}
		

	}

}
