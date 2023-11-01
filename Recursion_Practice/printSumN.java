package Recursion_Practice;
import java.util.*;
public class printSumN {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int n= sc.nextInt();
    
	System.out.println(printNsum(n));
	}
public static int printNsum(int n) {
	if(n==0) {
		return 0;
	}
	int sum=n+printNsum(n-1);
	return sum;
}
}
