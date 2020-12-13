package Praticejava;

public class Bbreakcode {

	public static void main(String[] args) {

		int i = 0, j = 5;
		lab1: for (i = 1; i < 5; i++) {

			System.out.println(i);

			for (;; --j) {
				{
					if (i > j)
						break;
				}
			}
			if (i == 3) {
				System.out.println(i);

			}
			 
		}
		lab1: System.out.println("i= " + i + ", j=" + j);
	}

}
