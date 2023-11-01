package Recursion;

public class PrintLastOccurance {

	public static void main(String[] args) {
		
				int [] arr= {10,20,20,10,10,20};
				  System.out.println(LO(arr,20,0)); 
				  
			}
			public static int LO(int []arr,int ali,int i) {
				if(i==arr.length) {
					return -1;
				}
				//BP=FO(0,last)
				//SP=FO(1,Last)
				      int sp=LO(arr,ali,i+1);
				      if(sp==-1&&arr[i]==ali) {// yaha saath mai sp==-1 and && karke lagane se hamne ye 
				    	                       //ensure kar liya ki last se ali ka index milne ke baad index ki value
				    	                        // change na hi basak aur places pe mile
				    	  return i;
				      }
				      else {
				    	  return sp;
				      }
				
			}

		}


	


