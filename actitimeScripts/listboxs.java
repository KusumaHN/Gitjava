package actitimeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/HTML%20files/Listboxs.html");
		
		WebElement	listbox = driver.findElement(By.xpath("//select[@id='d1']"));
				
				Select s1 = new Select(listbox);
				
				// select the option by index
				s1.selectByIndex(3);
				Thread.sleep(5000);
				
				// select the option by value
				s1.selectByValue("2");
				Thread.sleep(5000);
				
				//select by visibletext
				s1.selectByVisibleText("Manual");
				Thread.sleep(5000);
				
			System.out.println(s1.isMultiple());
				 
		WebElement Multilistbox = driver.findElement(By.xpath("//select[@id='d2']"));
		 Select s2 = new Select(Multilistbox);
		 
		 s2.selectByIndex(3);
		 Thread.sleep(5000);
		 s2.deselectByIndex(3);
		 
		 s2.selectByValue("5");
		 Thread.sleep(5000);
		 
		 s2.selectByVisibleText("Apple");
		 Thread.sleep(5000);
		 
		 s2.deselectAll();
		 
		 System.out.println(s2.isMultiple());
	}
	

}
