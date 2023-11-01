package Recursion_Practice;

public class RemoveAllDuplicate {
public static boolean [] map= new boolean[26];
public static void solve(String str,int idx,String newString) {
	if(idx==str.length()) {
		System.out.println(newString);
		return;
	}
	char currChar =str.charAt(idx);
	if(map[currChar-'a']== true) {
		solve(str, idx+1, newString);
	}else {
		newString +=currChar;
		map[currChar-'a']=true;
		solve(str, idx+1, newString);
	}
}
	public static void main(String[] args) {
     int idx=0;
     String str = "abbccda";
		solve(str,idx,"");

	}

}
