package ChallengeQ;

public class CToF {

	public static void main(String[] args) {
		int min=0;
		int max=100;
		int step=20;
		//int level=0;
		int C=0;
		int F=0;
		while(F<=max) {
			C=(int)((5.0/9)*(F-32));
			System.out.println(F+" "+C);
			F=F+step;
		}
				
	}

}
