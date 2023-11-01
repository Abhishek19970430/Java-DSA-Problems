package Recursion;

public class Fibonacii {

	public static void main(String[] args) {
		System.out.println(Fibo(4));
	}
	
	public static int Fibo(int n) {
		if(n<=1) {
			return n;
		}
		
		int sp1= Fibo(n-1);
		int sp2= Fibo(n-2);
		return sp1+sp2;
	}

}
