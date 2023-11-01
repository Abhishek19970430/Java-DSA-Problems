package Lec03;

public class Ques30 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int i;
		
		while(row<=n) {
			i=n;
			while(i>=1) {
				
				System.out.print(i+"  ");
				i--;
			}
			
			
			row++;
			System.out.println();
		}
	}

}
