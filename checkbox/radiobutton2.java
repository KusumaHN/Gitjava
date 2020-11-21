package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/HTML%20files/radio2.html");
		          List<WebElement> allradiobut = driver.findElements(By.xpath("//input[@type='radio']"));
		          for(WebElement radiobut : allradiobut)
		          {
		        	  
		        	  radiobut.click();
		        	  }
	

}
}