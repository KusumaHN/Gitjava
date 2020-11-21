package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class componentislinkrnot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement component= driver.findElement(By.xpath("//a[@id='loginButton']"));
		String link=component.getTagName();
		if(link.equals("a")){
			System.out.println("component is a link");
		}else{
			System.out.println("component is not a link");
		}

	}

}
