package RecursionWithArray;

import java.util.Scanner;

public class Print_all_indices_inArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        int []arr= new int[n];
        for(int i=0;i<n;i++) {
         	arr[i]= sc.nextInt();
        	}
        int m= sc.nextInt();
        int brr[]=PAI(arr,m,0,0);
        for(int i:brr) {
        	System.out.println(i);
        }
	}

	
	public static int [] PAI(int []arr,int m, int n,int fsf) {
		if(n==arr.length) {
			return new int[fsf];
		}
		
		if(arr[n]==m) {
		 int R[]=PAI(arr,m,(n+1),fsf+1);
		 R[fsf]=n;
		 return R;
		}else {
		 int R[]=PAI(arr,m,(n+1),fsf);
			return R;
		}
		
	}
}
