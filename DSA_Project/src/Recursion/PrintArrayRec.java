package Recursion;

public class PrintArrayRec {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		
		PrintArray(arr, 0);
		
//  BP - P(0 to Last)
//  Sp - P(1 To Last)
	}
	public static void PrintArray(int [] arr, int i) {
		if(i==arr.length) {
			return ;
		}
		
		System.out.println(arr[i]);
		PrintArray(arr,i+1);
		
	}

}
