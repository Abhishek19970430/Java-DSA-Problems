package Recursion;

public class PrintDecInc {

	public static void main(String[] args) {

		int n=4;
	    PDecInc(n);

	}
	static void PDecInc(int n){
		if(n==0) {
			return;
		}
		System.out.println(n);
		PDecInc(n-1);
		System.out.println(n);
	}
	}



