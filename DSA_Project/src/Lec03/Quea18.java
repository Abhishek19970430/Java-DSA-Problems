package Lec03;
import java.util.*;

public class Quea18 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int cnt_sp=0;
		int cnt_st=0;
		int total_sp=(n/2)+1;
		int total_st=1;
		
	int row=1;
	
	while(row<=n) {
		cnt_sp=0;
		cnt_st=0;
		
		
		while(cnt_sp<total_sp) {
			System.out.print("   ");
			cnt_sp++;
		}
		
		while(cnt_st<total_st) {
			System.out.print("*  ");
			cnt_st++;
		}
		
		
		row++;
		System.out.println();
		if(row<=(n/2)+1) {
			total_sp--;
			total_st+=2;
		}
		else {
			total_sp++;
			total_st-=2;
		}
	}
		
	}

}
