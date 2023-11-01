package RecursionType2;

public class maze_path {
public static void main(String[] args) {
	chal(0, 0, 2, 2, ""); 
}
public static void chal(int currC,int currR,int destC, int destR,String path) {
	if(currC==destC && currR==destR) {
		System.out.println(path);
		return;
	}
	
	if(currC>destC || currR>destR) {
		return;
	}
	
	chal(currC+1, currR, destC, destR, path+"R");
	chal(currC, currR+1, destC, destR, path+"D");
}
}
