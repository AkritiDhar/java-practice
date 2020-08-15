package oopspackage.one;

import java.util.LinkedList;

public class LinkedListConcept {
	public static void main(String[] args) {
		//Creating linked list object
		 LinkedList<String> lref = new LinkedList<String>();
		 // Adding elements using add method
		 lref.add("IDE");
		 lref.add("RC");
		 lref.add("WebDriver");
		 lref.add("Grid");
		 System.out.println(lref);
//		 System.out.println(lref.get(0));
//		 lref.addFirst("first");
//		 System.out.println(lref);
//		 System.out.println(lref.get(0));
//		 int i = 0;
//		 while(i<lref.size()){
//			 System.out.println(lref.get(i));
//			 i++;
//		 }
//		 
//		 int num = lref.size()-1;
//		 while(num>=0){
//			 System.out.println(lref.get(num));
//			 num--;
//			 
//			 
//			 
//			 
//		 }
		 
		 lref.set(1, "Hi");
		 System.out.println(lref);
		 lref.remove("IDE");
		 System.out.println(lref);
		 System.out.println(lref.get(0));
		 lref.clear();
		 System.out.println(lref);
	}
	
	

}
