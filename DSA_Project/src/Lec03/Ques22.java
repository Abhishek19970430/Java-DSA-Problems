package Lec03;

public class Ques22 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int cst=0;
		int csp=0;
		int nsp=0;
		int nst=(2*n-1);
		while(row<=n) {
			
			cst=0;
			csp=0;
			
			if(row==1) {
				cst=-1;
			}
			while(cst<nst/2) {
				
				System.out.print("* ");
				cst++;
			}
			
          while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
             cst=0;
             while(cst<nst/2) {
				
				System.out.print("* ");
				cst++;
			}
             
             if(row==1) {
            	 nst--;
            	 nsp++;
            
             }else {
            	 nst-=2;
            	 nsp+=2;
             }
             
			
			row++;
			System.out.println();
		}

	}

}
