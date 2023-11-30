package RecurionBasic;

public class PrintDec {

	public static void main(String[] args) {
		int n=4;
		Solve(n);
	}
   public static void Solve(int n) {
	   
	   if(n==0) {
		   return;
	   }
	   System.out.println(n);
	   Solve(n-1);
	   
   }
	
	
}
