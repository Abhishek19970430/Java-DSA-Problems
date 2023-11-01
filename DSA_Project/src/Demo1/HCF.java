package Demo1;

public class HCF {

	public static void main(String[] args) {
		int n1=42;
		int n2=16;
		int i=n2;
		while(i>=1) {
		if((n1%i==0)&&(n2%i==0)) {
			System.out.println(i);
			break;
			}
		i--;
		}

	}

}
