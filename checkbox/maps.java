package checkbox;

import java.util.LinkedHashMap;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maps {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> l1 = new LinkedHashMap<String, Integer>();
		l1.put("Voda", 2);
		l1.put("idly", 3);
		l1.put("Dosa", 2);
		l1.put("palav", 1);
		
		System.out.println(l1.size());
		
		Integer v1 = l1.get("idly");
		System.out.println(v1);
		
		Integer v2 = l1.get("Dosa");
		System.out.println(v2);
		
		
		System.out.println(l1.containsKey("Pongal"));
		
		Set<String> allkeys = l1.keySet();
		for(String keys : allkeys){
			System.out.println(keys);
			System.out.println(l1.get(keys));
			
			
		}
	
		

	}

}
