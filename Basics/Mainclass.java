package Basics;

interface WebDriver{
	
	void fueltype();
}

 class FirefoxDriver implements WebDriver{
	
	 public void fueltype(){
		 System.out.println("Diesel");
	 }
}
 class chromeDriver implements WebDriver{
		
	 public void fueltype(){
		 System.out.println("petrol");
	 }
}
 class specification{
	 public static void getDetails (WebDriver driver)
	 {
		 driver.fueltype();
	 }
 }
public class Mainclass {

	public static void main(String[] args) {
		FirefoxDriver f1 = new FirefoxDriver();
		chromeDriver c1= new chromeDriver();
		specification.getDetails(f1);
		specification.getDetails(c1);
		
		
	}

}
