package actitimeScripts;

import java.util.PriorityQueue;

public class queue {

	public static void main(String[] args) {
	
		PriorityQueue q1 = new PriorityQueue();
		
		q1.add("java");
		q1.add("selenium");
		q1.add("manual");
		q1.add("sql");
		q1.add("java");
		int size=q1.size();
		for(int i=0; i<size; i++){
			System.out.println(q1.poll());
			
		}
	}

}
