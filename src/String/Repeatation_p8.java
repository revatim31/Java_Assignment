/*Exercise 8 : Given a string and an int n, return a string made of n repetitions of the last n characters 
of the string. You may assume that n is between 0 and the length of the string, inclusive.
Sample input and expected output
repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"*/

package String;
public class Repeatation_p8 
{
	static String repeat(String str,int n)
	{
		String s="";
		for(int i=0;i<n;i++) 
		{
			s+=str.substring(str.length()-n);
		}
		
		return s;
	}
	public static void main(String[] args)
	{
		System.out.println(repeat("Hello",3));
		System.out.println(repeat("Hello",2));
		System.out.println(repeat("Hello",1));
	}
}