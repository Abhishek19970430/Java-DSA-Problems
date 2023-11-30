package ArrayListBasic;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		//How to declare Array list
		ArrayList<Integer>list= new ArrayList<>();
		//to check list size after declare
		System.out.println(list+"->"+ list.size());
		
		
		//How to add List element
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list+"->"+ list.size());
		
		//How to add at pericular index
		list.add(1,1000);//all other element shifted forwared
		System.out.println(list+"->"+ list.size());
		
		//How to get value from array list
		int val=list.get(1);//not list[1]
		System.out.println(val);
		
		 //How to set value at perticular index by replacing value
		 list.set(1, 2000);
		 System.out.println(list+"->"+ list.size());
		
		 //How to remove element from array list
		 list.remove(1);
		 System.out.println(list+"->"+ list.size());
		 
		 // How to make arraylist for String
		 ArrayList<String> l2 = new ArrayList<>();
		 l2.add("Hello");
		 l2.add("Bellow");
		 l2.add("cellow");
		 System.out.println(l2+"->"+ l2.size());
		 
		 
		 //how to apply loop using ArrayList
		 for(int i=0;i<list.size();i++) {
			 int val1= list.get(i);
			 System.out.print(val1);
		 }
		 
		 
		 
		
	}

}
