
package Recursion;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	     int n=s.nextInt();
	     System.out.println(Fact(n));    
	      
	}
	     
	    

	    public static long Fact(int x){
	      if(x==0){
	          return 1;
	      }
	        return x*Fact(x-1);
	    }
	}


