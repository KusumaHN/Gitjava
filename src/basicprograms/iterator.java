package basicprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			Object obj= itr.next();
			System.out.println(obj);
		}
	}

}
