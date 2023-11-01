package Lec03;

public class Ques11 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int total_st=n;
		int cnt_st=0;
		int cnt_sp=0;
		int total_sp=(n-1);
		while(row<=n){
			
			cnt_st=0;
			cnt_sp=0;
		    
			while(cnt_sp<total_sp) {
				System.out.print("   ");
				cnt_sp++;
				cnt_st++;
				
			}
			
			while(cnt_st<=total_st) {
				
				if((cnt_st+row)==6) {
				   System.out.print("*  ");
				   cnt_st++;
				}
				else if((cnt_st+row)==7) {
					System.out.print("   ");
					cnt_st++;
				}
				else if((cnt_st+row)==8){
					System.out.print("*  ");
					cnt_st++;
				}
				else if((cnt_st+row)==9){
					System.out.print("   ");
					cnt_st++;
				}
				else if((cnt_st+row)==10){
					System.out.print("*  ");
					cnt_st++;
				}
				else if((cnt_st+row)==11){
					System.out.print("   ");
					cnt_st++;
				}
				else if((cnt_st+row)==12){
					System.out.print("*  ");
					cnt_st++;
				}
				else if((cnt_st+row)==13){
					System.out.print("   ");
					cnt_st++;
				}
				else if((cnt_st+row)==14){
					System.out.print("*  ");
					cnt_st++;
				}
				else
					cnt_st++;
			}
			
			
			row++;
			System.out.println();
			total_sp--;
			total_st++;
		}

	}

}
