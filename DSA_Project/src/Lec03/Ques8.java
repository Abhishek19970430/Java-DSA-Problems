package Lec03;

public class Ques8 {

	public static void main(String[] args) {
		int row=1;
		int n=5;
		int cnt_st=0;
		int total_st=n;
		int total_sp=3;
		
		
		while(row<=n){
			
			 cnt_st=1;
			while(cnt_st<=total_st) {
				if(row==cnt_st) {
					System.out.print("* ");
					cnt_st++;
				}
				else if(row+cnt_st==6) {
					System.out.print("* ");
					cnt_st++;
				}
				   else{
					System.out.print("  ");
					//cnt_sp++;
					cnt_st++;
					}
					
				}
			 row++;
			  System.out.println();
				
			}
			

		 
			
	}

}
