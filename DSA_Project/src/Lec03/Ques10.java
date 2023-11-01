package Lec03;

public class Ques10 {

	public static void main(String[] args) {
		        int n=5;
		        int row=1;
				int cnt_sp=0;
				int cnt_st=0;
				int total_sp=0;
				int total_st=(2*n-1);
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
					total_sp++;
					total_st-=2;
					System.out.println();
				}
				

	}

}
