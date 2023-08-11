package CollectionsJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Class43HashMap {

	public static void main(String[] args) {
		// HashMap contains data as key and Value pairs <K,V>
		/*
		 * eg: key as URL and Value as qa.avysh.in
		 * Contains only unique keys
		 * Not synchronized and No Order
		 * Java HashMap may have one null key and multiple null values
		 */

		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("VAnshika", "VAsu"); // put is similar to add, in HashMap there is no add method so using put method
		hm.put("VAnshi", "VAsu loves you");
		hm.put("Piku", "VAsu kisses you");
		hm.put("Bujji", "VAsu missing you");
		hm.put("Bulu Bulu", "VAsu hugs you");
		hm.put("VAnshik", "VAsu");
		System.out.println(hm);
		
		
//		we can remove using only key or key vale pair
		hm.remove("VAnshik");
		hm.remove("Piku", "VAsu kisses you");
		System.out.println(hm);
		
		
		Set s = hm.keySet(); // it takes all the keys from hashmap and converts to set
		System.out.println(s);
		
		for(String Key:hm.keySet()) {    //like object we can use integer, string etc.... dont forget vasu
			System.out.println(Key + ":"+ hm.get(Key));
		}
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + ":"+ hm.get(key));
		}
		
	}

}
