// Write a Java program to insert elements into the linked list at the first and last position. 
//Insert color "Pink" at first and "Blue" at last position in linked list in exercise 4.

package Collection;

import java.util.LinkedList;
	import java.util.Iterator;
	public class Ex5 {
	  public static void main(String[] args) {
	    // create an empty linked list
	     LinkedList<String> l_list = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          l_list.add("Red");
	          l_list.add("Green");
	          l_list.add("White");
	          l_list.add("Black");
	          l_list.add("Yellow");
	      
	        // print original list
	   System.out.println("Original linked list:" + l_list);  
	 
	   l_list.removeFirst();
	   //System.out.println("After removing" + l_list);
	   // iterate through all elements in a linked list
	    System.out.println("After removing");
	    Iterator listItr = l_list.iterator();
	    while (listItr.hasNext()){
	        System.out.println(listItr.next());
	    }
	        l_list.addFirst("pink");
	        l_list.addLast("Blue");
	        System.out.println("\nAfter adding color Pink at first and Blue at last position" + l_list);
	  }
}
