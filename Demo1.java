package Praticejava;



class Apple{
	
}
public class Demo1 {
	
	static Apple a1;

	public static void main(String[] args) {

						Apple a1= new Apple();
						System.out.println(a1);
						
						Apple a2=new Apple();
						System.out.println(a2);
					
						
						System.out.println(a1==a2);
						
						a2=a1;
						System.out.println(a1==a2);
						
						
						a1=null;
						
						a2=null;
						
						System.out.println(a1==a2);

	}

}
