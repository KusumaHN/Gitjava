package Praticejava;

public class ForeachLoopcode {

	public static void main(String[] args) {


		int marks[] = {70, 45, 89, 90, 67};
		for(int i=0; i<5; i++){
			System.out.println(marks[i]);
		}
		
		String names[] = {"Kushi", "Suma", "Kusuma", "Kusma"};
		for(int i=0; i<4; i++)
		{
			System.out.println(names[i]);
		}
		
		
		for(int mark:marks)
			System.out.println(mark);
		
		for(String name: names)
			System.out.println(name);
		
		for(int i=10; i<=100; i+=10)
			System.out.println(i);
		
		for(int i=1; i<=10; i++)
			System.out.println(1);
		
		for(int i=2; i<=100; i+=2)
			System.out.println(i);

	}

}
