package RecurionBasic;

public class Factorial {

	public static void main(String[] args) {
		int n=3;
		System.out.println(Fact(n));
	}

	public static int Fact(int n) {
		if(n==1) {
			return 1;
		}
		
		int sum=0;
		 
		sum= (n*Fact(n-1));
		
		return sum;
		
	}
	
}
