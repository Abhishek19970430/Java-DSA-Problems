package Lec03;

public class Ques31 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int i;
		int colmn=1;
		
		while(row<=n) {
			i=n;
			colmn=1;
			while(i>=1) {
				
				if((row+colmn)==6) {
					System.out.print(" * ");	
				}else {
				System.out.print(i+"  ");
				}
				i--;
				colmn++;
			}
			
			
			row++;
			System.out.println();
		}
	}

}
