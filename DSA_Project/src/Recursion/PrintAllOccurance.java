package Recursion;

public class PrintAllOccurance {

	public static void main(String[] args) {
		int arr[]= {10,20,30,20,20,10,20};
		int [] rp=PAO(arr,20,0,0);
		for(int i:rp) {
        System.out.println(i);  
		}

	}

	public static int [] PAO(int[] arr,int ali,int i,int total){
		
		if(i==arr.length) {
			return new int[total];
		}
		
		if(arr[i]==ali) {
			int [] sp= PAO(arr,ali,i,total+1);
			sp[total]=i;
			return sp;
		}
		else {
			int[] sp= PAO(arr, ali,i+1,total);
			return sp;
		}
		
		 
	}
}
