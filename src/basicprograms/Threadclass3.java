package basicprograms;

public class Threadclass3 {

	public static void main(String[] args) {
		
		Thread th1 =Thread.currentThread();
		System.out.println(th1.getName());
		System.out.println(th1.getId());
		System.out.println(th1.getPriority());
		
		th1.setName("kusuma");
		th1.setPriority(6);
		System.out.println(th1.getName());
		System.out.println(th1.getId());
		System.out.println(th1.getPriority());
		
		
	}

}
