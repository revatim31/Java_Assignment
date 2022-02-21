/*Exercise 9 :Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false*/
package String;
public class Prefixstr_9
{
	static boolean prefix(String str,int n) 
	{
		return str.substring(n).contains(str.substring(0, n));
	}
	public static void main(String[] args) 
	{
		System.out.println(prefix("abXYabc", 1));
		System.out.println(prefix("abXYabc", 2));
		System.out.println(prefix("abXYabc", 3));
	}
}