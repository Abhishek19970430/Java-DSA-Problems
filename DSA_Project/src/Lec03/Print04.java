package Lec03;
import java.util.*;

public class Print04 {

			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				int n = s.nextInt();
				int row=1;
				int total_st=1;
				int total_sp=(n-1);
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
					total_st++;
					total_sp--;
					System.out.println();
				}
				
				
			}

		}




