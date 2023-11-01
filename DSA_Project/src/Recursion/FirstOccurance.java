 package Recursion;

public class FirstOccurance {

	public static void main(String[] args) {
		int [] arr= {10,20,20,10,30,20};
		  System.out.println(FO(arr,30,0));  
	}
	public static int FO(int []arr,int ali,int i) {
		if(i==arr.length) {
			return -1;
		}
		
		//BP=FO(0,last)
		//SP=FO(1,Last)
		      int sp=FO(arr,ali,i+1);
		      if(arr[i]==ali) {
		    	  return i;
		      }
		      else {
		    	  return sp;
		      }
		
	}

}
