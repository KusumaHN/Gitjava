package Operators;

class Orange
{
	
}
class Apple{
	
}

public class Methodstype {
	
	static int print()
	{
		return 2;
	}
	static void add(int a, int b)
	{
		int c= a+b;
		System.out.println(c);;
	}
	
	static boolean sum(){
		return true;
	}
	
	static byte ad()
	{
		Byte b=10;
		return b;
	}
	
	static int mul()
	{
		int i=100;
		return i;
	}

	static char mu()
	{
		char ch='A';
		return ch;
	}
	
	static String div(String name)
	{
		
		return "Hello" + name;
	}
	
	static Orange getOrange()
	{
		return new Orange();
	}
	
	static Apple getApple(){
		Apple a1 = new Apple();
		return a1;
	}
	
	static int[] getmarks()
	{
		int[] marks= {25, 64, 83, 70};
		return marks;
	}
	
	static double[] getvalue(){
		double[] value ={23.5, 45.5, 67.2};
		return value;
	}
	
	public static void main(String[] args) {
		System.out.println(print());
		System.out.println(mu());
		System.out.println(div("kusuma"));
		System.out.println(ad());
		System.out.println(sum());
		add(2, 5);
		System.out.println(mul());
		System.out.println(getOrange());
		System.out.println(getApple());
		System.out.println(getmarks());
		System.out.println(getvalue());
		

	}

}
