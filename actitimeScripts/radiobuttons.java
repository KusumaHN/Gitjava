package actitimeScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/HTML%20files/radiobut.html");
		                 List<WebElement> allradiobuttons = driver.findElements(By.xpath("//input[@type='radio']"));
		                
		                 for(WebElement radiobutton : allradiobuttons){
		                	 radiobutton.click();
		                	 Thread.sleep(20000);
		                	 if(radiobutton.isSelected()){
		                		
		                		 System.out.println("FeMale radiobutton is selected");
		                		 radiobutton.click();
		                		 Thread.sleep(20000);
		                		 
			                }else{
		                		 
			                	 Thread.sleep(20000);
		                		 System.out.println("male radiobutton is not selected");
		                		 radiobutton.click();
		                		 
		                 }
		                 }
	}
	
	}


