/*Exercise 3: Write a Java program to check whether a given string ends with the contents of another string.
Sample Output: 
"Python Exercises" ends with "se"? false                                                                      
"Python Exercise" ends with "se"? true*/
package String;


public class CheckContentp3
{
	public static void main(String[] args)
	{
		System.out.println("\"Python Exercises\" ends with \"se\"?"+("Python Exercises".endsWith("se")));
		System.out.println("\"Python Exercises\" ends with \"se\"?"+("Python Exercise".endsWith("se")));
	}
}