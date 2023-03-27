package list_interface;

import java.util.LinkedList;
import java.util.Deque;
import java.util.Queue;

public class linkedlist_queue_deque {
	
	  public static void main(String[] args){
		  
//Java Linkedlist using Deque inerface
		  
		    Deque<String> animals = new LinkedList<>();

		    // add element at the beginning
		    animals.add("Cow");
		    System.out.println("LinkedList: " + animals);

		    animals.addFirst("Dog");
		    System.out.println("LinkedList after addFirst(): " + animals);

		    // add elements at the end
		    animals.addLast("Cat");
		    System.out.println("LinkedList after addLast(): " + animals);

		    // remove the first element
		    animals.removeFirst();
		    System.out.println("LinkedList after removeFirst(): " + animals);

		    // remove the last element
		    animals.removeLast();
		    System.out.println("LinkedList after removeLast(): " + animals);
		 
// Java Linkedlist using Queue interface
		    
		    Queue<String> languages = new LinkedList<>();

		    // add elements
		    languages.add("Python");
		    languages.add("Java");
		    languages.add("C");
		    System.out.println("LinkedList: " + languages);

		    // access the first element
		    String str1 = languages.peek();
		    System.out.println("Accessed Element: " + str1);

		    // access and remove the first element
		    String str2 = languages.poll();
		    System.out.println("Removed Element: " + str2);
		    System.out.println("LinkedList after poll(): " + languages);

		    // add element at the end
		    languages.offer("Swift");
		    System.out.println("LinkedList after offer(): " + languages);
		  }
		  }
