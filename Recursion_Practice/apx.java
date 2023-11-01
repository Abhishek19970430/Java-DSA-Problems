package Recursion_Practice;

import java.util.Scanner;

public class apx {

	public static void main(String[] args) {
		// Calculate A ki power x;
		int a=5;
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
//		BP:a^n;
//		SP:a^n-1;
		System.out.println(apown(a, n));
		
		
	}
	public static int apown(int a, int n) {
		if(n==0) {
			return 1;
		}
		
		return a*apown(a, n-1);
	}

}
