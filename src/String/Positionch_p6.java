/*Exercise 6: Write a Java program to get a sub string of a given string between two specified positions.
Sample Output: 
old = The quick brown fox jumps over the lazy dog. */
package String;


public class Positionch_p6 
{
	public static void main(String[] args) 
	{
		String str ="The quick brown fox jumps over the lazy dog.";
		System.out.println("old ="+str+"\t\tnew ="+str.substring(10, 26));
	}
}