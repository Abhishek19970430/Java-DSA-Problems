package Recursion_Practice;

public class factorial {

	public static void main(String[] args) {
		int n=5;
		
		System.out.println(fact(n));
		
	}
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int m= fact(n-1);
	       return n*m;
	}

}
