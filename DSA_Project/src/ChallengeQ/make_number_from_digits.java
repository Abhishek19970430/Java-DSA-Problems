package ChallengeQ;

import java.util.Scanner;

public class make_number_from_digits {

	public static void main(String[] args) {
		System.out.println("Enter no. of digit");
		Scanner s=new Scanner(System.in);
		int nod=s.nextInt();
		int i=0;
		int digit;
		int number=0;
		int ans=0;
		while(i<nod) {
			 digit=s.nextInt();
			number=number*10+digit;
			i++;
		}
		
		while(number>0) {
			ans=ans*10+(number%10);
			number=number/10;
		}
		System.out.println(ans);

	}

}
