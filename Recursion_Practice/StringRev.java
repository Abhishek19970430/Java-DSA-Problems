package Recursion_Practice;

public class StringRev {

	public static void main(String[] args) {
		String str= "abcd";
		int idx=str.length()-1;
         printReverse(str,idx);
	}
	
	public static void printReverse(String str,int idx) {
		if(idx==0) {
			System.out.println(str.charAt(idx));
			return;
		}
		System.out.print(str.charAt(idx));
	     printReverse(str, idx-1);
	}

}
