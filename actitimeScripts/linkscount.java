package actitimeScripts;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkscount {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./Software/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/HTML%20files/Links.html");
		
	    java.util. List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	    
	    System.out.println("Number of links =" + allLinks.size());
	    
	    for(WebElement link : allLinks)
	    {
	    	String  text = link.getText();
	    	String  URL = link.getAttribute("href");
	    	System.out.println(text + "---->" + URL);
	    }
		
	}

}