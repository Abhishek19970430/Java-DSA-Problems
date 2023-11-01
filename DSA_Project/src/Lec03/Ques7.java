package Lec03;

public class Ques7 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int cnt_st=0;
		int cnt_sp=0;
		int total_st=n;
		int total_sp=0;
		while(row<=n) {
			cnt_st=0;
		    cnt_sp=0;
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++; 
			}
			
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			//System.out.println(total_sp);
			if(row!=1&&row!=5) {
				cnt_st=0;
			}
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			System.out.println();
			row++;
			if(row!=1&&row!=5) {
				total_st=1;
			    total_sp=3;}
			else {
				total_st=n;
			    total_sp=0;
			}
			
		}
	}

}
