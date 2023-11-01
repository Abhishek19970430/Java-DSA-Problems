package RecursionType2;

public class Stairs_using_Combination {

		public static void main(String[] args) {
			Stair(0,1,4,"");

		}
	   public static void Stair(int curr,int last_jump,int dest, String path) {
		   if(curr==dest) {
			   System.out.println(path);
			   return;
		   }
		   if(curr>dest) {
			   return;
		   }
		   if(last_jump<=1) {
		   Stair(curr+1,1,dest,path+"1");
		   }
		   if(last_jump<=2) {
		   Stair(curr+2,2,dest,path+"2");
		   }
		   if(last_jump<=3) {
		   Stair(curr+3,3,dest,path+"3");
		   }
	   }
	}
	


