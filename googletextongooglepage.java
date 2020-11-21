import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class googletextongooglepage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement value = driver.findElement(By.xpath("//img[@alt='Google']"));
		String v1=value.getTagName();
		if(v1.equals("img")){
			System.out.println("Google text is image");
		}
		else{
			System.out.println("Google text is not a image");
		}

	}

}
