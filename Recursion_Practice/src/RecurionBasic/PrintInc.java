package RecurionBasic;

public class PrintInc {

	public static void main(String[] args) {
		int n=5;
//		Solve(n);
		PDI(n);
		

	}
	public static void Solve(int n) {
		if(n==0) {
			return;
		}
		Solve(n-1);
		System.out.println(n);
	}
	
	public static void PDI(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
	}

}
