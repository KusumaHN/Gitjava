package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox1selected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/HTML%20files/1checkbokselected.html");
		          List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		          for(WebElement checkbox : allcheckbox)
		          {
		        	  if(checkbox.isSelected())
		        	  {
		        		  System.out.println("Checkbox already selected");
		        		  checkbox.click();
		        	  }else{
		        		  System.out.println("Checkbox not selected");
		        		  checkbox.click();
		        	  }
		          }

	}

}
