package Recursion_Practice;

public class PrintAllOccurance {

	public static void main(String[] args) {
		int arr[] = {20,10,30,40,20,20};
	    int count=0;
	    int idx=0;
		int [] res= solve(arr,idx,20,count);
		for(int val:res) {
			System.out.print(val+",");
		}
	}
	
	public static int [] solve(int [] arr,int idx,int ali,int count) {
		if(idx==arr.length) {
			//Base case count= ali ki total occurance
			 return new int [count];
			
		}
		
		if(arr[idx]==ali) {
			int [] brr=solve(arr,idx+1,ali,count+1);//yaha ham recursive call mai 
			                           // ali occurance bhi count kar le rahe hai.
			brr[count]=idx;
			return brr;
			
		}else {
			int [] brr=solve(arr,idx+1,ali,count);
			return brr;
		}
		
		
	}

}
