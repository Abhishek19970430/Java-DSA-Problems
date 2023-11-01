package Recursion;

public class MaxInArray {

	public static void main(String[] args) {
		
		int [] arr= {100,20,80,40,5};
		
	      System.out.println(Max(arr,0));
	}
	public static int Max(int[]arr,int i) {
		if(i==arr.length) {
			return Integer.MIN_VALUE;
		}
		int sp=Max(arr,i+1);
		return Math.max(sp, arr[i]);
	}

}
