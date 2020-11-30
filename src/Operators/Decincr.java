package Operators;

public class Decincr {

	public static void main(String[] args) {
		
		
		int i=0, j=1;
		
		int k = i + j++ + ++i + ++j + ++i;    // 0+1+1+3+2
		System.out.println(k);
		
		int L = i + j++ + ++i + ++j + i++;    // 2+3+3+5+3
		System.out.println(L);

	}

}
