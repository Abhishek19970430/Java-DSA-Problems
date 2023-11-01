package Lec03;

public class Ques21 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int cnt_st=0;
		int cnt_sp=0;
		int total_st=1; 
		int total_sp=7;
		while(row<=n) {
			    
			cnt_st=0;
			cnt_sp=0;
			while(cnt_st<total_st) {
				System.out.print("*  ");
				cnt_st++;
			}
			
			while(cnt_sp<total_sp) {
				System.out.print("   ");
				cnt_sp++;
			}
			
			cnt_st=0; 
			if(row==n) {
				cnt_st=1;
			}
			while(cnt_st<(total_st)  ){
				System.out.print("*  ");
				cnt_st++;
			}
			
			
			row++;
			System.out.println();
			if(row==n) {
				total_sp--;
				total_st++;
			}
			
			if(row<=4) {
				total_st++;
				total_sp-=2;
			}
			
			
				
		}
		

	}

}
