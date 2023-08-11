package CollectionsJava;

public class Collections {
	
	/*
	 * Collections is an framework or an API that provides the overall architecture to store the object or to manipulate the data
	 * Collections contains interfaces and classes within that libraries
	 * 
	 * Interfaces that are majorly used in JAVA:
	 * 
	 * Iterable -> Collections
	 * Collections ->  Queue, List, Set
	 * 
	 * Map -> Map is a seperate interface
	 * 
	 * Classes that are majorly used in JAVA:
	 * 
	 * Priority Queue, Array List, Linked List, Vector, HashSet, LinkedHashSet, HashMap, Hashtable
	 * 
	 * 
	 * -----------
	 * Collections work on objects and so that primitive data types cannot be used in collections
	 * 
	 * So we can wrap and unwrap the primitive data types into objects -> wrapper class
	 * 
	 *  
	 */
	public static void main(String[] args) {
		int i = 10;
		Integer int1 = new Integer(i); // wrapping primitive data type - auto boxing
		System.out.println(int1);
		
		int j = int1;  // unwrapping - auto unboxing
		System.out.println(j); 
//		In collections this auto boxing and unboxing will happen automatically we dont need to specifically do that
		
//		The most widely used collections are HashMap, HAshSet, ArrayList
		
	}

}
