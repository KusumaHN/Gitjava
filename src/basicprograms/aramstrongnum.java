package basicprograms;

public class aramstrongnum {

	public static void main(String[] args) {
		int no=371;
		int copy=no;
		int cube=0;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			int cube1=rem*rem*rem;
			sum=sum+cube1;
			no=no/10;
		}
  System.out.println(sum);
  if(copy==sum)
  {
	  System.out.println("aramstrong number"); 
  }
  else{
	  System.out.println("not a aramstrong number"); 
  }
	}

}
