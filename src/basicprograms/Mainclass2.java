package basicprograms;

class Demo1 extends Thread{
	public void run()
	{
		for(int i=100; i<110; i++){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class Sample1 implements Runnable{
	public void run(){
		for(int i=1; i<10; i++){
			System.out.println(i);
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Thread t1=new Thread(d1);
		t1.start();
		
		Sample1 s1=new Sample1();
		Thread t2=new Thread(s1);
		t2.start();
		
	}

}
