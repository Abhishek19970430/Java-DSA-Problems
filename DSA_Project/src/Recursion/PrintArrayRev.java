package Recursion;

public class PrintArrayRev {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		Print(arr,0);
	}
	
	public static void Print(int []arr, int i) {
		if(i==arr.length) {
			return;
		}
		
		Print(arr,i+1);
		System.out.println(arr[i]);
	}

}
