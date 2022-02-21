/*Exercise 1 :Write a Java program to get the character at the given index within the String. 
Sample Output:
Original String = Java Exercises! The character at position 0 is*/
package String;
public class IndexStringp1 
{
	   public static void main(String[] args)
	    {
	        String str = "Java Exercises!";
	        System.out.println("Original String = " + str);
	      
	        int index1 = str.charAt(0);
	     

	   
	        System.out.println("The character at position 0 is " +(char)index1);
	    }
	}