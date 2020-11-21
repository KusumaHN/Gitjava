package runTimePoly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase1 {



				public static void testBrowser1(WebDriver driver){
					
					driver.get("file:///F:/HTML%20files/sample3.html");
					
					WebElement link = driver.findElement(By.id("d1"));
					link.click();
					driver.close();
					
							
				}

				public static void main(String[] args) {
					String chromekey= "webdriver.chrome.driver";
					String chromevalue= "./Software/chromedriver.exe";
					System.setProperty(chromekey, chromevalue);
					 
					 
					 String geckokey= "webdriver.gecko.driver";
					 String geckovalue= "./Software/geckodriver.exe";
					System.setProperty(geckokey, geckovalue);
					
					WebDriver cdriver = new ChromeDriver();		
				testBrowser1(cdriver);
					
					WebDriver fdriver = new FirefoxDriver();		
					testBrowser1(fdriver);
					 
				}

		}
