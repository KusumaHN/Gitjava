package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiofacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		Thread.sleep(20000);
		          List<WebElement> allradiobut = driver.findElements(By.xpath("//input[@type='radio']"));
		          for(WebElement radiobut : allradiobut)
		          {
		        	  if(radiobut.isSelected())
		      		{	
		      		System.out.println("Female radiobutton selected");
		      		}else{
		      			System.out.println("Male radiobutton");
		      			radiobut.click();
		      			System.out.println("Male radiobutton selected");
		      		}
	

		          }
	}
	}
		          
	


