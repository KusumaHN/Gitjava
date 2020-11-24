package basicprograms;


	class sample12{
		
	 static void add(){
		System.out.println("am a static method");
	}
}
	
	class Demo13 extends sample12{
		static void add(){
			System.out.println("am a recent static method");
		}	
	}
	public class Methodstatic {
	public static void main(String[] args) {
		sample12 s1 = new Demo13();
		s1.add();

	}

}
