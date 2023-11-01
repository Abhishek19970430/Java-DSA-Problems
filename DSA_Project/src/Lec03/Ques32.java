package Lec03;

public class Ques32 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int csp=0;
		int cst=0;
		int nst=1;
		int nsp=2*n-2;
		int r=0;
		int i=0;
		 while(row<=(2*n-1)) {
			 
			 cst=0;
			 csp=0;
			 r=row-i;
			 while(cst<nst) {
				 if(cst%2==0) {
				    if(row>((2*n-1)/2+1)) {
						 System.out.print(r);
						 
					 }
				    else {
					 System.out.print(row);
				    }
					 
				 }else {
				 System.out.print("* ");
				 }
				 
				 cst++;
			 }
			 
			 
                 while(csp<nsp) {
				 
				 System.out.print("  ");
				 csp++;
			 }
			 
			 if(row<(2*n-1)/2+1)
			 {
				 nst+=2;
				 nsp-=2;
			 } 
			 else {
				 i+=2;
				 nst-=2;
				 nsp+=2;
			 }
			 
			 
			 row++;
			 System.out.println();
			 
		 }
	}

}
