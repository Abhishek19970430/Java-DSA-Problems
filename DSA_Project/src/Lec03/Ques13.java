package Lec03;

public class Ques13{

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int cnt_st=0;
		int total_st=1;
		
		while(row<=2*n-1) {
			
	         cnt_st=0;
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++;
			
			}
			 
			
			row++;
			if(row<=5) {
				 total_st++;
			 }
			 else {
				 total_st--;
			 }
			System.out.println();
		}
		
	}

}