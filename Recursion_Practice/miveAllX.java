package Recursion_Practice;

public class miveAllX {
public static 	int count=0;
public static String str = "axbcxxd" ;
	public static void main(String[] args) {
		int idx=0;
		String newString= "";
		solve(str,idx,newString);
	}
	public static void solve(String str,int idx,String newString) {
		if(idx==str.length()) {
			for(int i=0;i<count;i++) {
				newString += 'x';
			}
			
			System.out.println(newString);
			return;
		}
		if(str.charAt(idx)=='x') {
			count++;
			solve(str,idx+1,newString);
			
		}else {
		    newString += str.charAt(idx);
			solve(str, idx+1,newString);
		}
	}

}
