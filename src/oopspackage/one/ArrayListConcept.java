package oopspackage.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

@SuppressWarnings("unused")
public class ArrayListConcept {
	public static void main(String[] args) {
		
		ArrayList<Integer> arraylist	= new ArrayList<>();
//		ArrayList< String> arr = Arrays.asList("Akriti","Pinki");
	//	System.out.println(arr);
		arraylist.add(123243534);
		arraylist.add(45645);
		arraylist.add(10);
	//	arraylist.add(9.9);
		System.out.println(arraylist);
		System.out.println(arraylist.get(1));
		
//		for(int i = arraylist.size()-1;i>=0;i--){
//			System.out.println(arraylist.get(i));
//		}
//		System.out.println("******");
//		for(int obj: arraylist){
//			System.err.println(obj);
//		}
//		
		//ArrayList using Iterator 
//		System.out.println("while loop with Iterator, or iterate with iterator ");
//		
	Iterator<Integer> itr = arraylist.iterator();
//		
//		while (itr.hasNext()) {
//			//Integer integer = (Integer) itr.next();
//			System.out.println(itr.next());
//			
//		}
		
//		System.out.println("Arrays to arraylist");
//		
		String array1 []= {"Akriti","Pinki","Rajesh","Dhar"};
		ArrayList< String> arrayList = new ArrayList<String>(Arrays.asList(array1));
		System.out.println(arrayList);
//		
//		arrayList.add("Naitik");
//		arrayList.add("Sangeeta");
//		arrayList.remove("Dhar");
//		System.out.println(arrayList);
//		
//		
//		ArrayList<String> arrayList1 = new ArrayList<String>();
//		Collections.addAll(arrayList1, array);
//		arrayList1.add("hello");
//		System.out.println(arrayList1);
		ArrayList<String> arrList= new ArrayList<String>();
	     String array[] = {"Raj","Kumar","Rajkumar"};   
	 
	     //array.length returns the current number of elements present in array
	     for(int i =0;i<array.length;i++)
	            {
	     	//We are adding each array's element to the ArrayList
	     	arrList.add(array[i]);
	     }
	     
	     System.out.println(arrList);
	     
	     /*ArrayList content*/
	     for(String str: arrList)
	     {
	          System.out.println(str);
	     }
		
		
		
		
	}

}
