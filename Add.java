package Praticejava;

public class Add {
	
	void add(int a, int b)
	{
		int res =a+b;
		System.out.println(" Addition Result = " + res);
	}

	public static void main(String[] args) {
		
		
		Add a= new Add();
		a.add(2, 3);
	}

}
