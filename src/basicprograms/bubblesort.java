package basicprograms;

public class bubblesort {

	public static void main(String[] args) {
		int arr[] ={100,200, 5, 20,80};
		int temp;
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=1; j<=arr.length-1; j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp =arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
			
		for(int i=0; i<=arr.length-1; i++){
			System.out.println(arr[i]);
		}
	}

}
