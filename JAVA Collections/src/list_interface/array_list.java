package list_interface;

import java.util.ArrayList;


public class array_list {

	public static void main(String[] args) {
		
		// create String type linked list
				ArrayList <String> myList = new ArrayList<>();
				
		// Add elements to the linked list
				myList.add("A");
				myList.add("B");
				myList.add("C");
				myList.add("D");
				myList.add("E");
				myList.add("F");
				
		// Print the list
				System.out.println(myList);
				
		// Get the item By index
				String str = myList.get(3);
				System.out.println(str);
				
		// Set/change the elements of the list
				myList.set(0, "Z");
				System.out.println(myList);

		// Remove the elements of the list
				myList.remove("F");
				System.out.println(myList);
				
		// contains() method
				System.out.println(myList.contains("y"));
				
		//indexOf() method
				System.out.println(myList.indexOf("C"));
				
		// size() method
				System.out.println(myList.size());
				
		//isEmpty method
				System.out.println(myList.isEmpty());
						
			}

	}


