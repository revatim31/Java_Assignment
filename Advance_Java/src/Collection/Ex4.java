/*Write a Java program to iterate through all elements in a linked list starting at the specified position.Position no 1. sample list is of colors with element "Red","Green","White","Black","Yellow".

Output will be "Green","White","Black","Yellow".*/



package Collection;

import java.util.LinkedList;
	import java.util.Iterator;
	public class Ex4 {
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
	   System.out.println("After removing" + l_list);
	   // iterate through all elements in a linked list
	    System.out.println("Display all elements");
	    Iterator listItr = l_list.iterator();
	    while (listItr.hasNext()){
	        System.out.println(listItr.next());
	    }
	  }
	}

