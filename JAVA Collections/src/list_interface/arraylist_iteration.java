package list_interface;

import java.util.ArrayList;

public class arraylist_iteration {
	
	public static void main(String[] args) {
	
    // creating an array list
    ArrayList<String> animals = new ArrayList<>();
    animals.add("Goat");
    animals.add("Cat");
    animals.add("Dog");
    System.out.println("ArrayList: " + animals);

    // iterate using for-each loop
    System.out.println("Accessing individual elements:  ");

    for (String language : animals) {
      System.out.print(language);
      System.out.print(", ");
    }
	}
	}

