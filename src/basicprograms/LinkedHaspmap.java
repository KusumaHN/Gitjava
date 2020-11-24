package basicprograms;


import java.util.LinkedHashMap;

public class LinkedHaspmap {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> l1 = new LinkedHashMap<String, Integer>();
		l1.put("Kusuma", 123);
		l1.put("Kushi", 125);
		l1.put("Kusumi", 233);
		l1.put("kusu", 125);
		System.out.println(l1);
	}

}
