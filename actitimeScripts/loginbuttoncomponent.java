package actitimeScripts;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginbuttoncomponent {
	
	public static void verifypagebycomponent (WebDriver driver, String xp)
	{
		try{
		 WebElement LoginBut = driver.findElement(By.xpath(xp));
		 System.out.println("Element is present in the source code");
		 if(LoginBut.isDisplayed()){
			 System.out.println("Element is visible");
		 }
		 else{
			 System.out.println("Element is not visible");
		 }
	}catch(NoSuchElementException e){
		System.out.println("Element is not present in the source code");
    
	}
		}
	

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		verifypagebycomponent(driver, ("//input[@id='username']"));
		verifypagebycomponent(driver, ("//input[@name='pwd']"));
		verifypagebycomponent(driver, ("//div[.='Login ']"));
	}

}
