package basicprograms;

public class Thread4 {

	public static void main(String[] args) {
		
		int[] arr={10, 20};
		try{
			System.out.println(arr[3]);
			int i= 1/0;
		}
		catch(ArithmeticException e){
			System.out.println("Caught");
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Handled");
			
		}
	}

}
