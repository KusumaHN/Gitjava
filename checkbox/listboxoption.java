package checkbox;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxoption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/HTML%20files/listbox1.html");
		WebElement listbox = driver.findElement(By.xpath("//select"));
		Select s1 =new Select(listbox);
		s1.selectByIndex(1);
		List<WebElement> alloptions = s1.getOptions();
		for(WebElement option : alloptions){
			String text = option.getText();
			System.out.println(text);
		}

	}

}
