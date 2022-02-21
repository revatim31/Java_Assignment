/*Exercise 4: Write a Java program to compare a given string to another string, ignoring case considerations.
Sample Output: 
"Stephen Edwin King" equals "Walter Winchell"? false 
"Stephen Edwin King" equals "stephen edwin king"? true.
*/
package String;


public class Cmp_p4 
{
	public static void main(String[] args)
	{
		System.out.println("\"Stephen Edwin King\" equals \"Walter Winchell\"?"+("Stephen Edwin King".equalsIgnoreCase("Walter Winchell")));
		System.out.println("\"Stephen Edwin King\" equals \"stephen edwin king\"?"+("Stephen Edwin King".equalsIgnoreCase("stephen edwin king")));
	}
}