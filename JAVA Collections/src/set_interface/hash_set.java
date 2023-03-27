package set_interface;


import java.util.HashSet;
import java.util.Iterator;

public class hash_set {
	


		public static void main(String[] args) {
			//creating HashSet
	        HashSet<Integer> evenNumber = new HashSet<>();

	        // Using add() method
	        evenNumber.add(2);
	        evenNumber.add(4);
	        evenNumber.add(6);
	        System.out.println("HashSet: " + evenNumber);

	        HashSet<Integer> numbers = new HashSet<>();
	        
	        // Using addAll() method
	        numbers.addAll(evenNumber);
	        numbers.add(5);
	        System.out.println("New HashSet: " + numbers);
	        
	        // Calling iterator() method
	        Iterator<Integer> iterate = numbers.iterator();
	        System.out.print("HashSet using Iterator: ");
	        
	        // Accessing elements
	        while(iterate.hasNext()) {
	            System.out.println(iterate.next());
	            
	        }
	        
	        // Using remove() method
	        boolean value1 = numbers.remove(5);
	        System.out.println("Is 5 removed? " + value1);

	       
	            
	        // Check if primeNumbers is a subset of numbers
	        boolean result = numbers.containsAll(evenNumber);
	        System.out.println("Is HashSet2 is subset of HashSet1? " + result);
	        
	        boolean value2 = numbers.removeAll(numbers);
	        System.out.println("Are all elements removed? " + value2);
	        
	    }

		}

