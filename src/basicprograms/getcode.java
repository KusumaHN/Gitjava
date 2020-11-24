package basicprograms;

class test123{
	String get(){
		return "Kusuma";
	}
}
public class getcode {

	public static void main(String[] args) {
		test123 t1= new test123();
		          String s=t1.get();
		              int count=s.length();
		              System.out.println(count);

	}

}
