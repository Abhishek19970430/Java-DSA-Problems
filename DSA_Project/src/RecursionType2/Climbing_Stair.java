package RecursionType2;

public class Climbing_Stair {

	public static void main(String[] args) {
		Stair(0,4,"");

	}
   public static void Stair(int curr, int dest, String path) {
	   if(curr==dest) {
		   System.out.println(path);
		   return;
	   }
	   if(curr>dest) {
		   return;
	   }
	   
	   Stair(curr+1,dest,path+"1");
	   Stair(curr+2,dest,path+"2");
	   Stair(curr+3,dest,path+"3");
   }
}
