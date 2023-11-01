package Recursion_Practice;

public class PI {

	public static void main(String[] args) {
		//BP= PI(4);
		//SP= PI(3);
		int n=4;
		
		PI(n);

	}

	public static void PI(int n) {
		if(n==1) {
			System.out.println(1);
			return;
		}
		PI(n-1);
		System.out.println(n);
		
	}
	
}
