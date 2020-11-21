package actitimeScripts;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class component1 {

	public static void main(String[] args) {
		
		String key = "webdriver.chrome.driver";
		String value = "./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///F:/HTML%20files/FNLNtextfield11.html");
		
		         WebElement   FN  =driver.findElement(By.xpath("//input[1]"));
		         FN.sendKeys("Kiran");
		         
		         try{
		        	 WebElement   LN  =driver.findElement(By.xpath("//input[2]"));
		        	 System.out.println("Element is present in the source code");
		        	 
		        	 if(LN .isDisplayed()){
		        		 System.out.println("Element is visible");
		        		 LN.sendKeys("Gowda");
		        	 }else
		        	 {
		        		 System.out.println("Element is not visible");
		        	 }
		         }catch(NoSuchElementException e){
		        	 System.out.println("Element is not present in the source code");
		         }

	}

}
