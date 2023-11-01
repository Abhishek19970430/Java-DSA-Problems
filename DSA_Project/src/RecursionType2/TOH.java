package RecursionType2;

public class TOH {

	public static void main(String[] args) {
		
       solve(3,'A','C','B');
	}
	
	public static void solve(int n,char src,char dest,char helper) 
	{
		if(n==0) {
			return;
		}
		
		solve(n-1,src, helper, dest);
		System.out.println("from " +src+" to "+dest );
		solve(n-1,helper,dest,src);
		
	}

}
