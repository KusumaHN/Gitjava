package basicprograms;



public class Threadclass1 {

	public void run(){
	
		for(int i=100; i<110; i++)
		{

			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
			}
		}
		}
	}

