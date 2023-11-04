package Recursion_Type3;

public class JumpingNumber {

	public static void main(String[] args) {
       for(int i=0;i<9;i++) {
    	   jumpNumber(i,100);		
       }

	}
	public static void jumpNumber(int curr, int limit) {
		if(curr>limit) {
			return;
		}
		System.out.println(curr);
		int digit = curr%10;
		if(digit>0) {
			jumpNumber(curr*10+(digit-1),limit);
		}
		if(digit<9) {
			jumpNumber(curr*10+(digit+1),limit);
		}
		
	}

}
