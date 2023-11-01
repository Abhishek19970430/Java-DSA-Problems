
import java.util.*;
public class basicCalculator {
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        char ch;
        do{
         ch= s.next().charAt(0);
        int  N1= s.nextInt();
        int  N2=  s.nextInt();
       
        switch(ch){
            case '*':
               System.out.println(N1*N2);
               break;
            case '+':
               System.out.println(N1+N2);
               break;
            case '-':
              System.out.println(N1-N2);
              break;
            case '/':
              System.out.println(N1/N2);
              break;
            case '%':
              System.out.println(N1%N2);
              break;
            case 'X':
              break;
            default:
              System.out.println("Invalid operation. Try again.");
        }
        }while(ch!='X');
        
    }
}
        
            

        
    


