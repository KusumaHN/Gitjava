package Operators;

public class Methodscode {
	
	public static void add(){
		System.out.println("adding");
	}
	
public void sub(){
	System.out.println("Sub");
	add();
	
	}
	
public static int mul(){
	add();
	// sub();
	//this.
 //super.
	return 10;
}

public Methodscode div(){
	sub();
	return new Methodscode();
}

	public static void main(String[] args) {
		Methodscode.add();
		Methodscode m1 = new Methodscode();
		m1.sub();
		Methodscode.mul();
		m1.div();
		
	}

}
