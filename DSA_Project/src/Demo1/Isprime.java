package Demo1;

public class Isprime {

	public static void main(String[] args) {
		int cnt=1;
		int n=5;
		int c;
		int a=0;
		int b=1;
		while(cnt<n){
		 c=a+b;

		a=b;
		b=c;
		cnt=cnt+1;
	}
		System.out.println(c);
	}

}
