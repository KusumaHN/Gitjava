package basicprograms;

public class Equals {

	public static void main(String[] args) {
		Equals e1=new Equals();
		Equals e2=new Equals();
		System.out.println(e1.equals(e2));
		
		Equals e3=new Equals();
		Equals e4=e3;
		System.out.println(e3.equals(e4));

	}

}
