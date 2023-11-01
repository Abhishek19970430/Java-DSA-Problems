package Lec03;
import java.util.*;
public class Ques9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		//int n=5;
		int cnt_sp=0;
		int cnt_st=0;
		int total_sp=(n-1);
		int total_st=1;
		while(row<=n) {
			
			cnt_st=0;
			cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("   ");
				cnt_sp++;
		      
			}
			
			while(cnt_st<total_st) {
				System.out.print("*  ");
				cnt_st++;
		      
			}
			
			row++;
			total_sp--;
			total_st+=2;
			System.out.println();
		}
		
	}

}
