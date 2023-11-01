package Lec03;

public class Ques28 {

	public static void main(String[] args) {
		
				int row=1;
				int n=5;
				int cnt_sp=0;
				int cnt_st=0;
				int total_sp=(n-1);
				int total_st=1;
				int count;
				int i;
				while(row<=n) {
					
					cnt_st=0;
					cnt_sp=0;
					while(cnt_sp<total_sp) {
						System.out.print("   ");
						cnt_sp++;
				      
					}
					
					  count=cnt_st;
					  i=row-1;
					while(cnt_st<total_st) {
					   
						
						if(count<total_st/2+1) {
							count++;
							i++;
						}else {
							count++;
							i--;
						}
						System.out.print(i+"  ");
						
						cnt_st++;
				      
					}
					
					row++;
					total_sp--;
					total_st+=2;
					System.out.println();
				}
				
			}

		}
