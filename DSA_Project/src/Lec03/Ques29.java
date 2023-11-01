package Lec03;

public class Ques29 {

	public static void main(String[] args) {
		
				int row=1;
				int n=5;
				int cnt_sp=0;
				int cnt_st=0;
				int total_sp=(n-1);
				int total_st=1;
				int count;
				int i=0;
				while(row<=n) {
					
					cnt_st=1;
					cnt_sp=1;
					while(cnt_sp<=total_sp) {
						System.out.print("   ");
						cnt_sp++;
				      
					}
					
					  
					while(cnt_st<=total_st) {
					   
						
						if(cnt_st==1||cnt_st==total_st) {
							System.out.print(row+"  ");
							
						}else {
							System.out.print(i+"  ");
						}
						
						
						cnt_st++;
				      
					}
					
					row++;
					total_sp--;
					total_st+=2;
					System.out.println();
				}
				
			}

		}
