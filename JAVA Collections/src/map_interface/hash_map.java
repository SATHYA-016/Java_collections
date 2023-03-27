package map_interface;

import java.util.HashMap;


public class hash_map {

	public static void main(String[] args) {
		
//		Create a new Hashmap
		
		HashMap<Integer, String> names = new HashMap<>();
		
//		Adding elements to the hashmap
		
		names.put(0, "Surya");
		names.put(1, "Raj");
		names.put(2, "Ravi");
		names.put(3, "Rahul");
		
//		Access hashmap elements
		
		String value = names.get(1);
		System.out.println(value);
		
		 // return set view of keys using keySet()
	    System.out.println("Keys: " + names.keySet());

	    // return set view of values using values()
	    System.out.println("Values: " + names.values());

	    // return set view of key/value pairs using entrySet()
	    System.out.println("Key/Value mappings: " + names.entrySet());
	    
	    // change element with key 2
	    names.replace(2, "Ramya");
	    System.out.println("HashMap using replace(): " + names);
	    
	 // remove element associated with key 2
	    String values = names.remove(0);
	    System.out.println("Removed value: " + values);

	    System.out.println("Updated HashMap: " + names);
		
	}

}
