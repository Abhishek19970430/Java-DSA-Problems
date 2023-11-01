
public class PrintDecInc {

	public static void main(String[] args) {
		printDecInc(4);

	}

	public static void printDecInc(int n){
		System.out.println(n);
		if(n==1) {
			System.out.println(n);
			return;
		}
		printDecInc(n-1);
		System.out.println(n);
	}
}
