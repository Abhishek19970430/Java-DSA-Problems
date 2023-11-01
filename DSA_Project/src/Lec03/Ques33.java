package Lec03;

public class Ques33 {

	public static void main(String[] args) {
		int n = 10;
		int row = n;
		int csp = 0;
		int cst = 0;
		int nst = 1;
		int nsp = 2 * n - 1;
		int r = 1;
		int i = 1;
		int p=0;
		while (row >= 1) {

			cst = 0;
			csp = 0;
			// r=row-i;

			while (csp < nsp) {

				System.out.print("  ");
				csp++;
			}

			i = row;
			r = 1;

			while (cst < nst) {
				if (r == ((nst / 2) + 1)) {
					System.out.print(p+" ");
					
					r++;
				}else {
			 
			  System.out.print(i + " ");}
			
				cst++;
				if (r < ((nst / 2) + 1)) {
					i++;
					r++;
				} else {
					i--;
					r++;
				}
			}

			while (csp < nsp) {

				System.out.print("  ");
				csp++;
			}

			nst += 2;
			nsp--;

//			 if(row<(2*n-1)/2+1)
//			 {
//				 nst+=2;
//				 nsp-=2;
//			 } 
//			 else {
//				 i+=2;
//				 nst-=2;
//				 nsp+=2;
//			 }
//			 

			row--;
			System.out.println();

		}
		
		
		
	}

}
