package Recursion_Practice;

public class PrintSubsequence {

	public static void main(String[] args) {
		String str = "abc";
		String path;
		solve(str,"");
	}
	public static void solve(String str,String path) {
		if(str.isEmpty()) {
			System.out.println(path);
			return;
		}
		char ch= str.charAt(0);
		String remain = str.substring(1);
		solve(remain, path+ch);
		solve(remain, path);
		
	}
	

}
