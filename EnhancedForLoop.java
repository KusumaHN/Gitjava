package Praticejava;

class Kusuma{
	
}

public class EnhancedForLoop {
	

	public static void main(String[] args) {
		
		int[] marks ={70, 65, 56, 89, 73};
		for(int i=0; i<5; i++)
			System.out.println(marks[i]);
		
		System.out.println("---------");
		
		
		float[] temps ={65.0f, 45.0f, 67.8f, 34,9f, 55.5f};
		for(int i=0; i<4; i++)
			System.out.println(temps[i]);
		
		System.out.println("---------");
		
		String[] names={"Kusuma", "Suma", "Kushi", "Gangu", "Raghu"};
		for (int i=0; i<5; i++)
			System.out.println(names[i]);
		
		System.out.println("---------");
		
		Kusuma k = new Kusuma();
		
		Kusuma[] suma={ new Kusuma(), new Kusuma(), new Kusuma(), k};
		for(int i=0; i<4; i++)
			System.out.println(suma);
		
		System.out.println("---------");
		
		System.out.println("Enhanced for Loop");
		
		for(int mark:marks)
			System.out.println(mark);
		
		for(float temp: temps)
			System.out.println(temp);
		
		for(String name :names)
			System.out.println(name);
		
		for(Kusuma Ku: suma)
			System.out.println(Ku);

	}

}
