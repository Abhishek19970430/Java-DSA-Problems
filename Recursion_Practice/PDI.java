package Recursion_Practice;

public class PDI {

	public static void main(String[] args) {
		int n=4;
	    PDI(n);
	    
	}
    public static void PDI(int n) {
    	if(n==0) {
    //		System.out.println(1);
    		return;
    	}
    	System.out.println(n);
    	PDI(n-1);
    	System.out.println(n);
    }
	
	
}
