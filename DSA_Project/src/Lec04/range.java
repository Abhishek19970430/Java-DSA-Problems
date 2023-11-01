package Lec04;

public class range {
	public static void main(String[] args) {
//		/*primitive and non primitive data type
//		integer - byte(1) short(2) int(4) long(8)
//		float - float double
//		boolean - true false*/
		byte a = 0;
		long intmax=0;
		long intmin=0;
		while (true) {
			a--;
			if(a>intmax) {
				intmax=a;
			}
			if(a<intmin) {
				intmin=a;
			}
//			System.out.println(a);
			if (a == 0) {
				break;
			}
		}
		System.out.println(intmin+" "+intmax);
		intmin=0;
		intmax=0;
		short b = 0;
		while (true) {
			b--;
			if(b>intmax) {
				intmax=b;
			}
			if(b<intmin) {
				intmin=b;
			}
//			System.out.println(b);
			if (b == 0) {
				break;
			}
		}
		System.out.println(intmin+" "+intmax);
		intmin=0;
		intmax=0;
		int c=0;
		while(true) {
			c--;
			if(c>intmax) {
				intmax=c;
			}
			if(c<intmin) {
				intmin=c;
			}
//			System.out.println(c);
			if(c==0) {
				break;
			}
		}
		System.out.println(intmin+" "+intmax);
		intmin=0;
		intmax=0;
		long d=0;
		while(true) {
			d--;
			if(d>intmax) {
				intmax=d;
			}
			if(d<intmin) {
				intmin=d;
			}
//			System.out.println(d);
			if(d==0) {
				break;
			}
		}
		System.out.println(intmin+" "+intmax);
	}
}
