package actitimeScripts;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxpriorityqueue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/HTML%20files/Listboxs.html");
		WebElement listbox = driver.findElement(By.xpath("//select[@id='d1']"));
		Select s1 = new Select(listbox);
		List<WebElement> alloptions = s1.getOptions();
		PriorityQueue q1 = new PriorityQueue();
		System.out.println("Single list options:-" );
		for (WebElement option : alloptions){
			String Text = option.getText();
			q1.add(Text);		
		}
		int size= q1.size();
		for(int i=0; i< size; i++){
			System.out.println(q1.poll());
		}
		WebElement Multibox = driver.findElement(By.xpath("//select[@id='d2']"));
		Select s2= new Select(Multibox);
		List<WebElement> alloptions1 = s2.getOptions();
		PriorityQueue q2 = new PriorityQueue();
		System.out.println("Multi Select list box:- ");
        for (WebElement option : alloptions1){
			String Text = option.getText();
			q2.add(Text);		
		}
        int size1= q2.size();
        for(int i=0; i< size1; i++){
	        System.out.println(q2.poll());
           } 
	}

}
