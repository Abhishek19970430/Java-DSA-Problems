package Lec03;

public class Print01 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while(row<=n) {
			int cnt_st = 0;
			while(cnt_st<n) {
				System.out.print("* ");
				cnt_st++;
			}
			
			
			row++;
			System.out.println();
		}
	}
}