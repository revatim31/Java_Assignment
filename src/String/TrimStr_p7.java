/*Exercise 7: Write a Java program to trim any leading or trailing whitespace from a given string. 
Sample Output: 
Original String:  Java Exercises                                                                              
New String: Java Exercises*/

package String;
public class TrimStr_p7
{
	public static void main(String[] args) 
	{
		String str = "Java Exercises";
		System.out.println("Original String : "+str+"\nNew String :"+str.trim());
	}
}