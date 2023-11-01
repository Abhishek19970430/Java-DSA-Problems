package Recursion_Practice;

public class MaxElementinArray {
  
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int idx= 0;
		int max=arr[0]; 
          Max(arr,idx,max);
          
          
	} 

	public static void Max(int arr[],int idx,int max) {
		if(idx==arr.length) {
			System.out.println(max);
			return;
		}
	     
	      if(arr[idx]>max) {
	    	  max=arr[idx];
	      }
		  Max(arr,idx+1,max);
	}
	
}
