package Operators;

public class PrePostInc {

	public static void main(String[] args) {
	
		int i=10;
		i = i++ + 5 + ++i +i + --i;    // (10+5+12+12+11 = 50)
		System.out.println(i);

		i = i++ + --i - i++ + --i;  //  (50+50-50+50 = 100)
		System.out.println(i);
		
		i = ++i + --i + i + i++;  // (101 + 100 + 100 + 100 = 401)
		System.out.println(i);
	}

}
