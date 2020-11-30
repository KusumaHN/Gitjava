package Operators;

public class IcrDec {

	public static void main(String[] args) {
	int i=10;
	int j=4;
	int k=2;
		i+=2;   //i=i+2;
		System.out.println(i);
		i-=2; 
		System.out.println(i);
		i*=2;
		System.out.println(i);
		i/=2;
		System.out.println(i);
		i%=2;
		System.out.println(i);
		System.out.println("i= "+i+" j= "+j+" k= "+k);
		IcrDec i1= new IcrDec();
		i1=null;
		if (i1 instanceof IcrDec){
			System.out.println("True");
			
		}
		else{
			System.out.println("False");
		}
		
		
		System.out.println(j&k);
		System.out.println(j|k);
	//	System.out.println(j!k);
		
		
		int marks = 45;
		String res= 45>50? "pass": "fail";
		System.out.println(res);
	}

}
