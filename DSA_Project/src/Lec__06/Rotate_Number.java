package Lec__06;

public class Rotate_Number {

	public static void main(String[] args) {
		int n=12345;
		int r=3;
		   
	
		int digit =n%(int)(Math.pow(10, r));
		int Qut=n/(int)(Math.pow(10, r));

		System.out.println(digit);
	}

}
