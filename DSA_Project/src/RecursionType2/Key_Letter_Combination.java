package RecursionType2;

public class Key_Letter_Combination {

	public static void main(String[] args) {
		KLC("35","");
		
	}
public static void KLC(String buttons,String path) {
	
	if(buttons.isEmpty()) {
		System.out.println(path);
		return;
	}
	
	String remain= buttons.substring(1);
	String ops= Options(buttons.charAt(0));
	for(int i=0;i<ops.length();i++) {
		KLC(remain,path+ops.charAt(i));
	}
	
}

public static String Options (char ch) {
	String[] arr = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	return arr[ch-'0'];
}
}
