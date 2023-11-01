package Lec03;

public class Ques15 {

	public static void main(String[] args) {
		int n = 10;
		int row = 1;
		int cnt_sp = 0;
		int cnt_st = 0;
		int total_sp = 0;
		int total_st = n;

		while (row <= 2 * n - 1) {
			cnt_sp = 0;
			cnt_st = 0;

			while (cnt_sp < total_sp) {

				System.out.print("   ");
				cnt_sp++;
			}

			while (cnt_st < total_st) {

				System.out.print("*  ");
				cnt_st++;
			}

			row++;
			System.out.println();
			if (row <= n) {
				total_sp += 2;
				total_st--;
			} else {
				total_sp -= 2;
				total_st++;
			}
		}
	}

}
