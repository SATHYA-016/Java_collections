package map_interface;

import java.util.LinkedHashMap;

public class linked_hash_map {
	
	public static void main(String[] args) {
		 // Creating LinkedHashMap of even numbers
       LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();

       // Using put()
       evenNumbers.put("Two", 2);
       evenNumbers.put("Four", 4);
       System.out.println("Original LinkedHashMap: " + evenNumbers);

       // Using putIfAbsent()
       evenNumbers.putIfAbsent("Six", 6);
       System.out.println("Updated LinkedHashMap(): " + evenNumbers);

       //Creating LinkedHashMap of numbers
       LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
       numbers.put("One", 1);

       // Using putAll()
       numbers.putAll(evenNumbers);
       System.out.println("New LinkedHashMap: " + numbers);
       
    // Using entrySet()
       System.out.println("Key/Value mappings: " + numbers.entrySet());

       // Using keySet()
       System.out.println("Keys: " + numbers.keySet());

       // Using values()
       System.out.println("Values: " + numbers.values());
       
       //get() - Returns the value associated with the specified key. If the key is not found, it returns null Using get()
       int value1 = numbers.get("Four");
       System.out.println("Returned Number: " + value1);

       /*getOrDefault() - Returns the value associated with the specified key. 
       If the key is not found, it returns the specified default value. */
       // Using getOrDefault()
       int value2 = numbers.getOrDefault("Five", 5);
       System.out.println("Returned Number: " + value2);
       
       
   }
}
