package basicprograms;


class sample{
	int y=26;
}
class Tester extends sample{
	
	void pool(){
		System.out.println("pool method");
	}
}
public class Mainclass {

	public static void main(String[] args) {
		
		                     sample s1 = new Tester();
		                     System.out.println(s1.y);
		                     
		                              Tester t1= (Tester) s1;
		                                    t1.pool();
		                                    System.out.println(t1.y);

	}

}
