package checkbox;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class duplicateoption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/HTML%20files/Newlistbox.html");
		                   WebElement value = driver.findElement(By.xpath("//select[@id='d2']"));
		                   Select s1 = new Select(value);
		                   List<WebElement> alloptions = s1.getOptions();
		                   LinkedHashMap<String,Integer>  l1 = new  LinkedHashMap<String,Integer>();
		                   for(WebElement option : alloptions)
		                   {
		                	   String text = option.getText();
		                	   if(l1.containsKey(text)){
		                		   Integer v= l1.get(text);
		                		   v++;
		                		   l1.put(text, v);
		                	   }else{
		                		   l1.put(text, 1);
		                		   
		                	   }
		                   }
		                   Set<String> allkeys=l1.keySet();
		                   for(String keys : allkeys){
		                	   if((l1.get(keys))>1){
		                		   System.out.println(keys);
		                	   }
		                	   
		                	  
		                   }

	}

}
