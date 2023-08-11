package CollectionsJava;

import java.util.ArrayList;
import java.util.Iterator;

public class Class40ArralyList {
	
	// this is not class 40 its class 41

	public static void main(String[] args) {
//		ArrayList can be used to store any type of value in the list... i.e., Resizeable array implementation of the list interface
		
//		we can store duplicate values, dynamic values in list interface
		
		// ADD ITEMS TO ARRAYLIST
		
		ArrayList al = new ArrayList(); //we don't have any values in this object defined
		/*
		 * If we use the generics then instead of storing different data types we can use/stick to only one data type in the array list
		 * ArrayList<Integer> al = new ArrayList<Integer>(); 
		 * 
		 * why generics is important?
		 * while unwrapping if the list contains multiple datatypes then we can't unwrap eg: int i = al.get(0); --> this will fail 
		 * again we have to use 
		 * int i = (Integer)al.get(0); -> we are doing type casting here 
		 * 
		 */
		
		
		al.add(10); // the 10 is not an integer, its an object
		al.add(10); // array can have duplicate items in the list.,,, in sets we can not have duplicates
		al.add(10); 
		al.add("String"); // the "String" is not an string its an object
//		The same list contains integer and string --- this is possible in the mechanism of wrapping and unwrapping
		
		System.out.println(al.size()); // to know the size of an object
		System.out.println(al); // to view the values stored in object
		
		
		//REMOVE ITEMS FROM ARRAYLIST
		
		al.remove(0); // we are specifying the index value in brackets
		System.out.println(al);
		
		//FETCH ITEMS FROM ARRAYLIST
		
		System.out.println(al.get(2));
		
		//TO ITERATE AND PRINT VALUES IN THE LIST
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//for each loop
		for (Object obj : al) {
			System.out.println(obj);
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext()); // has next is used to check if there are any values in the list the return true
		{
			System.out.println(itr.next()); // next is used to iterate to next elements
			
		}

	}

}
