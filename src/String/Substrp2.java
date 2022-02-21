/*Exercise 2: Write a Java program to test if a given string contains the specified sequence of char values.
Sample Output: 
Original String: PHP Exercises and Python Exercises 
Specified sequence of char values:
Python 
Output : The string "PHP Exercises and Python Exercises" contains string "Python"
*/

package String;


public class Substrp2
{
	public static void main(String[] args) 
	{
		String s1 = "PHP Exercises and Python Exercises";
		String s = "Python";
		
		System.out.println("The String "+s1+" contains "+(s1.contains(s)?s:""));
	}
}