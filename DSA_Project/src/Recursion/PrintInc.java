package Recursion;

public class PrintInc {

	public static void main(String[] args) {
		int n=4;
	    PInc(n);

	}
	static void PInc(int n){
		if(n==0) {
			return;
		}
		PInc(n-1);
		System.out.println(n);
	}
}
