package Recursion;

public class PrintDec {

	public static void main(String[] args) {
		printDec(100);
		
	}

	public static void printDec(int n){
		if(n==1) {
			System.out.println(n);
			return ;
		}
		System.out.println(n);
		printDec(n-1);
		
	}
}
