package RecursionWithArray;

import java.util.Scanner;

public class DisplayArrayReverse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]= sc.nextInt();
        	}
        print(arr,n-1);
        }
   public static void print(int arr[],int n) {
	   if(n<0) {
		   return;
	   }
	   System.out.println(arr[n]);
	   print(arr,n-1);
	   
   }

}
