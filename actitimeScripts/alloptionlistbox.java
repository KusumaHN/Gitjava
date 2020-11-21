package actitimeScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alloptionlistbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/HTML%20files/Listboxs.html");
		
		WebElement listbox = driver.findElement(By.xpath("//select[@id='d1']"));
		Select s1 = new Select(listbox);
		List<WebElement> alloptions = s1.getOptions();
		System.out.println("Single select options :- ");
		for(WebElement option : alloptions){
			String text = option.getText();
			System.out.println(text);
		}
		
		
		WebElement Multibox = driver.findElement(By.xpath("//select[@id='d2']"));
		Select s2= new Select(Multibox);
		List<WebElement> alloptions1 = s2.getOptions();
		System.out.println("Multi Select list box:- ");
		for(WebElement option1 : alloptions1){
			String text1 = option1.getText();
			System.out.println(text1);
	
		}
		driver.close();
		}
	}


