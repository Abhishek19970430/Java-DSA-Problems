package Recursion_Practice;

import java.util.HashSet;

public class PrintUniqueSubsequence {

	public static void main(String[] args) {
		String str = "aaa";
		HashSet<String>set= new HashSet<>();
		String newString;
		solve(str,"",set);
	}
	public static void solve(String str,String newString,HashSet<String>set) {
		if(str.isEmpty()) {
			if(set.contains(newString)) {
				return;
			}else {
				System.out.println(newString);
				set.add(newString);
				return;
			}
			
		}
		char ch= str.charAt(0);
		String remain = str.substring(1);
		solve(remain, newString+ch,set);
		solve(remain, newString,set);
		
	}
	
}
