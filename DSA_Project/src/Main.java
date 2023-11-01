

//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner s = new Scanner(System.in);
//        int N=s.nextInt();
//        oddEvenRecur(N);}
//    
//     public static void oddEvenRecur(int n){
//         int s=n;
//          if(n<1){
//              return;
//          }
//          if(n>5){
//              return;
//          }
//           System.out.println(n);
//          oddEvenRecur(n-2);
//           System.out.println(n);
//           oddEvenRecur(n+2);
//          }
//         
//         
//    }
//    
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        solve(n);
    }

    public static void solve(int n){
        if(n == 0)
            return;
        
        if(n%2 != 0)
            System.out.println(n);
        
           solve(n-1);

        if((n%2) == 0)
            System.out.println(n);
        
    }
  }

