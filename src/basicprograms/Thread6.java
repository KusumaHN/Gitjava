package basicprograms;

public class Thread6 {

	public static void main(String[] args) {
		try{
			int i=1/0;
		     }
		catch(ArithmeticException e){
			System.out.println("Caught");
		}
		catch(Exception e)
		  {
			System.out.println("handled");
		  }
		
	}

}
