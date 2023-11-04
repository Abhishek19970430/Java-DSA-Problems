package Recursion_Type3;

public class TOH {

	public static void main(String[] args) {
		toh(3,'A','C','B');

	}
 public static void toh(int n, char src,char des,char help) {
   	if(n==0) {
   		return;
   	}
	 
	toh((n-1),src,help,des);
	System.out.println(n+" from "+src+" to "+des);
	toh((n-1),help,des,src);
}
}
