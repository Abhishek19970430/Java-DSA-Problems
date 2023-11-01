package Lec03;

import java.util.*;

public class Print03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = 5;
		int row=0;
		int total_st=n;
		while(row<n) {

			int cnt_st=0;
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			
			row++;
			total_st--;
			System.out.println();
		}
		
		
	}

}
