package Praticejava;

public class Exam {
	
	static int a=1111;
	
	static{
		a=a-- - --a;
	}

	{
		a= a++ + ++a;
		System.out.println(a);
	}
	public static void main(String[] args) {

  System.out.println(a);
  Exam e = new Exam();
  System.out.println(e.a);

	}

}
