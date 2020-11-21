package actitimeScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alternatecheckboxselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("///F:/HTML%20files/checkbox.html");
		                 List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		                 for(WebElement checkbox : allcheckbox){
		                	
		                	 if(checkbox.isSelected()){
		          
		                		 System.out.println("checkbox is already selected");
		                		 checkbox.click();
			                }else{
		                		 System.out.println("checkbox is not selected");
		                 checkbox.click();
		                 }
		                 }
	}

}
