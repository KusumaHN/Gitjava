package actitimeScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxarraylistsorted {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/HTML%20files/Listboxs.html");
		
		WebElement listbox = driver.findElement(By.xpath("//select[@id='d1']"));
		Select s1 = new Select(listbox);
		List<WebElement> alloptions = s1.getOptions();
		List l1 = new ArrayList();
		System.out.println("Single list options:-" );
		for (WebElement option : alloptions){
			
			String Text = option.getText();
			l1.add(Text);
				
		}

		Collections.sort(l1);
		
		for (Object l2 : l1){
			System.out.println(l2);
		}
		
		WebElement Multibox = driver.findElement(By.xpath("//select[@id='d2']"));
		Select s2= new Select(Multibox);
		List<WebElement> alloptions1 = s2.getOptions();
		List l3 = new ArrayList();
		System.out.println("Multi Select list box:- ");
for (WebElement option : alloptions1){
			
			String Text = option.getText();
			l3.add(Text);
				
		}

		Collections.sort(l3);
		
		for (Object l4 : l3){
			System.out.println(l4);
		}
	}

}
