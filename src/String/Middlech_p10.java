/*Exercise 10: 

Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
*/

package String;
public class Middlech_p10
{
	static String middle(String str) 
	{
		return str.substring((str.length()/2)-1, (str.length()/2)+1);
	}
	public static void main(String[] args)
	{
		System.out.println(middle("string"));
		System.out.println(middle("code"));
		System.out.println(middle("Practice"));
	}
}