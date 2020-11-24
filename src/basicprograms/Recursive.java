package basicprograms;

public class Recursive {

	public static void main(String[] args) {
		disp(1);
	}
	static void disp(int no)
	{
		if(no<=10)
		{
			System.out.println(no);
			no++;
			disp(no);
			
		}

	}

}
