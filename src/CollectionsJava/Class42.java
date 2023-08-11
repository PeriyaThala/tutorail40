package CollectionsJava;

import java.util.HashSet;
import java.util.Iterator;

public class Class42 {

	public static void main(String[] args) {
		// Hashsets 
		/*
		 * In sets -> it discards the duplicates, only unique elements are stored
		 * 
		 */
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(40);
		hs.add(40);
		hs.add(40);
		System.out.println(hs); // it's not printed in order -> another difference in set vs list .......... items are stored based on hashing algorithm
//		set is unindexed
//		Set is not ordered
//		we can't access values based on index
		hs.remove(10);
		System.out.println(hs); 
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(Object obj: hs) {
			System.out.println(obj);
		}
		

	}

}
