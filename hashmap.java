import java.util.LinkedHashMap;
import java.util.Set;


public class hashmap {

	public static void main(String[] args) {

				LinkedHashMap<String, Integer> l1 = new LinkedHashMap<String, Integer>();
				l1.put("Kusuma", 3);
				l1.put("suma", 2);
				l1.put("Kusuma", 1);
				l1.put("Kushi", 4);
				l1.put("Kushi", 3);
				
				System.out.println("size=" + l1.size());
				
				Integer a = l1.get("Kusuma");
				System.out.println("value1 =" + a);
		
				Integer a1 = l1.get("Kushi");
				System.out.println("value2 =" + a1);
				
				System.out.println(l1.containsKey("kusma"));
				
				Set<String>  allkeys = l1.keySet();
				for(String keys : allkeys){
					System.out.println("Keys :- " + keys);
					System.out.println(l1.get(keys));
					
				}
		
				

	}

}
