package basicprograms;

import java.util.HashSet;

public class Foreachloop {

	public static void main(String[] args) {
		char [] ch= {'a', 'b','c'};
		for(char cha :ch)
		{
			System.out.println(cha);
		}
		System.out.println("###############");
		HashSet l1=new HashSet();
		l1.add(10);
		l1.add(20.50);
		l1.add('A');
		for(Object obj:l1)
		{
			System.out.println(obj);
		}
	}

}
