package Praticejava;

public class ExampleCode {

	public static void main(String[] args) {


		int i='A';
		System.out.println(i);
		
		char ch='B';
		System.out.println(ch);
		
		ch=67;
		System.out.println(ch);
		System.out.println(ch++);
		
		System.out.println(ch + 1);
		
		int k= ch+1;
		System.out.println(k);
		
		for(i='A'; i<'Z'; i++)
			System.out.println(i);
		
		for(char ch1=65; ch1<=90; ch1++)
			System.out.println(ch1);
		
		for(char ch1='Z'; ch1>='A'; ch1-=2)
			System.out.println(ch1); 
		
		for(int j=1; j<=10; j++,System.out.print("I Love Java")); 
		
		System.out.println("i '\n' love '\n' java '\n' and '\n' selenium");

	}

}
