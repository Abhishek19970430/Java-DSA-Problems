package Recursion_Practice;
import java.util.*;
public class fibonacii {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
	    System.out.println(Fibo(n));

	}

	public static int Fibo(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int sp1 = Fibo(n-1);
		int sp2 = Fibo(n-2);
		
		int R = sp1+sp2;
		return R;
	}
}
