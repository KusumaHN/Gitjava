package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class followingsibling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webfx.com/blog/social-media/");
            WebElement data = driver.findElement(By.xpath("//option[.='SEARCH']/following-sibling::option"));
               Select s1 = new Select(data);
          List <WebElement> options =s1.getOptions();
               for (WebElement data1:options)
               {
            	   String Result = data1.getText();
                System.out.println(Result);
               }
	}

}
