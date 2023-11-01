package Recursion_Practice;

public class ReverseArrayPrint {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		int idx=arr.length-1;
 		print(arr,idx);
	}
	public static void print(int arr[],int idx) {
		if(idx<0) {
			return;
		}
       System.out.print(arr[idx]+",");
       print(arr,idx-1);
	}


}
