package Lec04;

public class Ques14 {

	public static void main(String[] args) {
		int N=5;
		int r=1;
		int cnt_st=0;
		int total_st=1;
		int total_sp=(N-1) ;
		while(r<=(N-1)) {
			System.out.println();
			while(cnt_st<total_sp){
				System.out.println(" ");
				cnt_st++;
				total_sp--;
			}
			while(cnt_st<total_st) {
				System.out.println("*");
				cnt_st++;
				total_st++;
			}
			if(r<=N) {
				total_st++;
				total_sp--;
			}
			else {
				total_st--;
				total_sp++;
			}
			
			
			r++;
			
	}

}
}
