package Lec03;

public class Ques2 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int total_st=1;
		int cnt_st;
		//Step1
		while(row<=n) {
			 cnt_st=0;
			 //Step-2
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			
			
			row++;
			total_st++;
			System.out.println();
		}

	}

}
