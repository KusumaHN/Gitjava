package Operators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class assignmentscan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		int ar[] = new int[6];
		HashMap<String, Integer> a1 = new HashMap<String, Integer>();

		int totalmarks = 0;
		boolean flag = false;

		for (int i = 0; i < ar.length; i++) {
			System.out.println("Subject Name");
			String subjectName = sc.nextLine();

			System.out.println("Enter marks");
			int mark = sc.nextInt();
			if (mark < 0 || mark > 100) {

				System.out.println("Marks should be greaterthan zero");
				flag = true;
				break;

			}
			// if (mark<35)
			// {
			// System.out.println("Failed subject= " + subjectName );
			// sc.nextLine();
			// }
			ar[i] = mark;
			totalmarks = totalmarks + ar[i];
			a1.put(subjectName, mark);

			sc.nextLine();
		}

		System.out.println(totalmarks);

		if (flag != true) {

			if (totalmarks <= 200) {
				System.out.println("Fail " + "student name= " + name
						+ " marks= " + totalmarks);

			} else if (totalmarks > 200 && totalmarks <= 350) {
				System.out.println("Secondclass " + "student name= " + name
						+ " marks= " + totalmarks);

			}

			else if (totalmarks > 350 && totalmarks <= 500) {
				System.out.println("Firstclass " + "student name= " + name
						+ " marks= " + totalmarks);

			} else if (totalmarks > 500 && totalmarks <= 600) {
				System.out.println("FCD " + "student name= " + name
						+ " marks= " + totalmarks);

			} else {
				System.out.println("Invalid");

			}
			System.out.println(a1);
		}
		Set<String> keySet = a1.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			if (a1.get(key) < 35) {
				System.out.println("Fail" + key + " mark = " + a1.get(key));
			}
		}
		sc.close();
	}

}
