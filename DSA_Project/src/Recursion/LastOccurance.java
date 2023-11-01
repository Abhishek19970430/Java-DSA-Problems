package Recursion;

public class LastOccurance {

	public static void main(String[] args) {
		
		int[] arr = { 10, 22, 7, 8, 5 };
		
		 System.out.println(LO(0,5,arr));
		
	}

	
	public static int LO(int s, int ali, int[] arr) {
		if (s == arr.length) {
			return -1;
		}
		int sp = LO(s + 1, ali, arr);
		if (sp == -1 && arr[s] == ali) {
			return s;
		} else {
			return sp;
		}
	}
}
