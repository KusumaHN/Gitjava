package basicprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Listiterator {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		ListIterator itr=l1.listIterator();
		while(itr.hasNext()){
			Object obj=itr.next();
			System.out.println(obj);
			
		}
	
		
		while(itr.hasPrevious())
				{
			Object obj=itr.previous();
			System.out.println(obj);
			
		}
	}

}
