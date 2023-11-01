package Recursion_Practice;

public class is_sorted {
    public static int arr[]= {1,2,3,1};

	public static void main(String[] args) {
		int idx=0;
		System.out.println(solve(idx));
	}
	public static boolean solve(int idx){
		if(idx==arr.length-1) {
			return true;
		}
		if(arr[idx+1]>arr[idx]) {
			return solve(idx+1);
			
		} else {
			return false;
		}
		  
	}

}
