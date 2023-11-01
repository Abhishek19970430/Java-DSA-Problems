package RecursionType2;

public class Jumping_Number {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			Jumping(i,100);
		}

	}
	public static void Jumping(int curr,int limit) {
		if(curr>limit) {
			return;
		}
		System.out.println(curr);
		int digit = curr%10;
		if(digit>0) {
			Jumping(curr*10 +(digit-1),limit);
		}
		if(digit<9) {
			Jumping(curr*10 +(digit+1),limit);
		}
	}

}
