package Operators;

public class Incrde {

	public static void main(String[] args) {
		
		int i=0, j=0;
		j = i + i++ + i + i++;    // 0+0+1+1
		System.out.println(i);
		System.out.println(j);
		
		
		int k=0, l=0;
		k=++l;
		
		System.out.println(k);
		System.out.println(l);
	}

}
