package Recursion_Practice;

public class printArray {

	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		int idx=0;
 		print(arr,idx);
	}
	public static void print(int arr[],int idx) {
		if(idx==arr.length) {
			return;
		}
       System.out.print(arr[idx]+",");
       print(arr,idx+1);
	}

}
