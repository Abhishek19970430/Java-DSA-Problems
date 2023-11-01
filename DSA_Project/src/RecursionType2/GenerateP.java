package RecursionType2;

public class GenerateP {

	public static void main(String[] args) {
		Generate(3,3,"");
	}
	public static void Generate(int open,int close,String path){

	       if(open==0&&close==0){
	           System.out.println(path);
	           return;
	       }

	       if(open>close) {
	    	   return;
	       }
           if(open>0) {
	        Generate(open-1,close,path+"(");
           }
           if(close>0) {
	        Generate(open,close-1,path+")");
           }
	    }
}
