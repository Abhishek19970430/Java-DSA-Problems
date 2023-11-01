package Recursion_Practice;

import java.util.Scanner;

public class FindF_Loccurance {

	public static void main(String[] args) {
		String str= "abaacdaefaah";
		Scanner sc= new Scanner(System.in);
		char c= sc.next().charAt(0);
		int idx=0;
		
		Solve(str,idx,c);
	}
	public static int First=-1;
	public static int Last=-1;
    public static void Solve(String str,int idx,char c) {
	if(idx==str.length()) {
		System.out.println("First Occurance is "+First);
		System.out.println("Last Occurance is "+Last);
		return;
	}
	if(str.charAt(idx)==c) {
		if(First==-1) {
			First=idx;
		}else {
			Last=idx;
		}
	}
	Solve(str,idx+1,c);
	
}
}
