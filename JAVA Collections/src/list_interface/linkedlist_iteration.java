package list_interface;

import java.util.LinkedList;

public class linkedlist_iteration {

	
	    public static void main(String[] args) {
	    	
	        // Creating a linked list
	    	
	        LinkedList<String> cars = new LinkedList<>();
	        
	        cars.add("FORD");
	        cars.add("BMW");
	        cars.add("FERARI");
	        
	        System.out.println("LinkedList: " + cars);

	        // Using forEach loop
	        
	        System.out.println("Accessing linked list elements:");
	        
	        for(String car: cars) {
	            System.out.print(car);
	            System.out.print(", ");
	        }
	    }
	}

