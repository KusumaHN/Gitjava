package Praticejava;

class Organge{
	
	
}


public class ReferenceAssign {

	public static void main(String[] args) {
	
		int x=5, y=4;
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(4==y);
		System.out.println(5==4);
		
		Organge o = new Organge();
		System.out.println(o);
		
		Organge o1 = new Organge();
		System.out.println(o1);
		
		System.out.println(o==o1);
		
		o=o1;
		
		System.out.println(o==o1);
		System.out.println(o!=o1);
	//	System.out.println(o>=o1);
		
		o=null;
		o1=null;
		
		System.out.println(o==o1);

	}

}
