package Praticejava;


class Orange{
	
}
public class Instanceof {
	
	static Orange o1;

	public static void main(String[] args) {
		
		System.out.println(o1);
		System.out.println(o1 instanceof Orange);
		
		o1=null;
		
		System.out.println(o1 instanceof Orange);
	}

}
