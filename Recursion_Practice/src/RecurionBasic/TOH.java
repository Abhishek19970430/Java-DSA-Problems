package RecurionBasic;
import java.util.*;
public class TOH {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 10;
        int n2 = 11;
        int n3 = 12;
        solve(n,n1,n2,n3);
        }
	
	public static void solve(int n,int S,int D,int H) {
		if(n==0) {
			return;
		}
		solve((n-1),S,H,D);
		System.out.println(n+"["+S+" -> "+D+"]");
		solve((n-1),H,D,S);
	}

}
