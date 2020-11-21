package actitimeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class component {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///F:/HTML%20files/FNLNtextfield.html");
		
		         WebElement   FN  =driver.findElement(By.xpath("//input[1]"));
		         FN.sendKeys("Kiran");
		         
		         try{
		        	 WebElement   LN  =driver.findElement(By.xpath("//input[2]"));
			         LN.sendKeys("Gowda");
		         }
		         catch (NoSuchElementException e)
		         {
		        	 System.out.println("Element is not present in the source code");
		         }
		         catch (ElementNotVisibleException e)
		         {
		        	 System.out.println("Element is present in the source code " + "but not visible");
		         }
	}

}
