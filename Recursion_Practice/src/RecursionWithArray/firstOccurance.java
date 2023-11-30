package RecursionWithArray;

import java.util.Scanner;

public class firstOccurance {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        int []arr= new int[n];
        for(int i=0;i<n;i++) {
         	arr[i]= sc.nextInt();
        	}
        int m= sc.nextInt();
        //System.out.println(FO(arr,m,0));
        System.out.println(LO(arr,m,(n-1)));

	}
	//public static int sp1=0;
	public static int FO(int []arr,int m,int n) {
		if(n==arr.length) {
			return -1;
		}
		int sp1=FO(arr,m,(n+1));
		if(arr[n]==m) {
			return n;
			
		}else {
			return sp1;
		}
		
	}
	public static int LO(int []arr,int m,int n) {
		if(n<0) {
			return -1;
		}
		int sp1=FO(arr,m,(n-1));
		if(arr[n]==m) {
			return n;
			
		}else {
			return sp1;
		}
		
	}

}

