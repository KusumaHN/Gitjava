package basicprograms;

class Demo{
	int x=20;
}
class test extends Demo{
	void Test()
	{
		System.out.println("test");
	}
}
public class Upcast {

	public static void main(String[] args) {
		System.out.println("..Upcasting..");
		        Demo d1    = new test();
		       System.out.println( d1.x );
		       
		       System.out.println("..Downcasting..");
		                    test t1  = (test) d1;
		                    t1.Test();
		                    
		                    System.out.println( t1.x );
		
	}

}
