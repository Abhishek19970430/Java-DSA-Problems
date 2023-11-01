package Lec03;

public class Ques6 {

	public static void main(String[] args) 
		{
			int row=1;
			int n=5;
			int total_st=n;
			int total_sp=0;
			int cnt_sp;
			int cnt_st;
			while(row<=n) {
				
				cnt_st=0;
				cnt_sp=0;
				while(cnt_sp<total_sp) {
					System.out.print("  ");
					cnt_sp++;
				}
				
				while(cnt_st<total_st) {
					System.out.print("* ");
					cnt_st++;
				}
				row++;
				System.out.println();
				total_st--;
				total_sp=(total_sp)+2;
				
			}

		}

	}

	

