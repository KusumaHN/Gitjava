package Praticejava;

public class Multipleifelese {

	public static void main(String[] args) {
		int a=0, b=20, c=30;
		
		if (a>b && a>c)
			System.out.println(a +" greather than " + b + " and " + c);

		else	if (b>a && b>c)
			System.out.println(b +" greather than " + a + " and " + c);
		
		else	if (c>a && c>b)
			System.out.println(c +" greather than " + a + " and " + b);
	}

}
