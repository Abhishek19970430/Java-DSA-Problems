package Lec03;

public class Ques17 {

	public static void main(String[] args) {
		int n = 19;
		int row = 1;
		int cnt_st = 0;
		int cnt_sp = 0;
		int total_st = n - 1;
		int total_sp = 1;

		while (row <= n) {
			cnt_sp = 0;
			cnt_st = 0;

			while (cnt_st < total_st/2) {
				System.out.print("*  ");
				cnt_st++;
			}

			while (cnt_sp < total_sp) {
				System.out.print("   ");
				cnt_sp++;
			}
			cnt_st=0;
			while (cnt_st < total_st/2) {
				
				System.out.print("*  ");
				cnt_st++;
			}

			row++;
			System.out.println();

			if (row <= n / 2 + 1) {
				total_sp += 2;
				total_st -= 2;
			} else {
				total_sp -= 2;
				total_st += 2;
			}
		}

	}

}
