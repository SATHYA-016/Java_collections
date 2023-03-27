package set_interface;

import java.util.Iterator;
import java.util.TreeSet;

public class tree_set {
	
	

	   // Main driver method
	    public static void main(String[] args)
	    {
	    	  TreeSet<Integer> evenNumbers = new TreeSet<>();

	          // Using the add() method
	          evenNumbers.add(2);
	          evenNumbers.add(5);
	          evenNumbers.add(4);
	          evenNumbers.add(6);
	          
	          System.out.println("TreeSet: " + evenNumbers);

	          // Calling iterator() method
	          Iterator<Integer> iterate = evenNumbers.iterator();
	          System.out.print("TreeSet using Iterator: ");
	          // Accessing elements
	          while(iterate.hasNext()) {
	              System.out.println(iterate.next());
	            
	          }
	         
	          // Using the first() method
	          int first = evenNumbers.first();
	          System.out.println("First Number: " + first);

	          // Using the last() method
	          int last = evenNumbers.last();
	          System.out.println("Last Number: " + last);

	         
	     
	          // Using higher()
	          System.out.println("Using higher: " + evenNumbers.higher(4));

	          // Using lower()
	          System.out.println("Using lower: " + evenNumbers.lower(4));

	          // Using ceiling()
	          /*The ceiling() is a method of TreeSet class which is used to find element which 
	        	is greater than or equal to the given element in the argument list.  */
	          System.out.println("Using ceiling: " + evenNumbers.ceiling(4));

	          // Using floor()
	          /*The floor() method of TreeSet class is used to find an element which is 
	           * less than or equal to the given element in the argument list. */
	          System.out.println("Using floor: " + evenNumbers.floor(3));
	   
	          //The headSet() method returns all the elements of a tree set before the specified element (which is passed as an argument).
	          // Using headSet() with default boolean value
	          System.out.println("Using headSet without boolean value: " + evenNumbers.headSet(5));

	       // Using headSet() with specified boolean value
	          System.out.println("Using headSet with boolean value: " + evenNumbers.headSet(5, true));
	          
	          
	          //The tailSet() method returns all the elements of a tree set after the specified element (which is passed as a parameter) including the specified element.
	          // Using tailSet() with default boolean value
	          System.out.println("Using tailSet without boolean value: " + evenNumbers.tailSet(4));
	          
	       // Using tailSet() with specified boolean value
	          System.out.println("Using tailSet with boolean value: " + evenNumbers.tailSet(4, false));
	          
	          // Using the remove() method
	          boolean value1 = evenNumbers.remove(5);
	          System.out.println("Is 5 removed? " + value1);
	          
	          // Using the removeAll() method
	          boolean value2 = evenNumbers.removeAll(evenNumbers);
	          System.out.println("Are all elements removed? " + value2);
	    }
	}

