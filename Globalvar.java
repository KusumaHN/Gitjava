package Praticejava;

class sample{
	
}

class Globalvar {
	
	static int i;
	//i= 20;
static	{
		i=25;
	}
	
int j=30;

{
	int k=20;
}

	public static void main(String[] args) {
		System.out.println(i);
		
		Globalvar g =  new Globalvar();
		System.out.println(g.j);
		
	//	Globalvar g1 =  new Globalvar();
	//	System.out.println(g1.k);
	}

}
