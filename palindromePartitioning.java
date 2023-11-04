package Recursion_Type3;

public class palindromePartitioning {

	public static void main(String[] args) {
		palin("nitin","");

	}
public static void palin(String word,String path) {
	if(word.length()==0) {
		System.out.println(path);
	} 
	for(int i=1;i<=word.length();i++) {
		String part= word.substring(0,i);
		if(ispalindrom(part)) {
		String remain= word.substring(i);
		palin(remain,path+"-"+part);
		}
	}
	
}
public static boolean ispalindrom(String part) {
	int s=0;
	int e= part.length()-1;
	while(s<e) {
		if(part.charAt(s)!=part.charAt(e)) {
			return false;
		}
		s++;e--;
	}
	return true;
	
}
}
