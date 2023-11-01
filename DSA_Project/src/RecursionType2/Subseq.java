package RecursionType2;

public class Subseq {

	public static void main(String[] args) {
		Subseqs("abcd","");
	}
	
	public static void Subseqs(String str,String path) {
		
		if(str.isEmpty()) {
			System.out.println(path);
			return;
			
		}
		
		char ch= str.charAt(0);
		String remain= str.substring(1);
		
		Subseqs(remain,path+ch);
		Subseqs(remain,path);
		
		
	}

}
