package RecursionWithArray;

import java.util.Scanner;

public class max_of_array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]= sc.nextInt();
        	}
        System.out.println(max(arr,n-1));
	}
	public static int max(int arr[],int n) {
		if(n<0) {
			return arr[0];
		}
		int sp1=max(arr,(n-1));
		if(arr[n]>sp1){
			return arr[n];
		}
		else {
			return max(arr,(n-1));
		}
		
	}

}
