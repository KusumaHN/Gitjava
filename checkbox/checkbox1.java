package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/HTML%20files/1checkbox.html");
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		if(checkbox.isSelected())
		{	
		System.out.println("checkbox selected");
		}else{
			System.out.println("checkbox not selected");
		}

	}

}
