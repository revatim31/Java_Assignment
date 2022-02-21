/*Exercise 16 : We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false

Write a program to check if we are in trouble . Print the output for method  parrotTrouble(boolean talking, int hour) 
using above sample input.
*/
package loops;
public class Parrot
{
	static boolean parrotTrouble(boolean talk,int hr)
	{
		if(talk && (hr<7 || hr>20))
			return true;	
		return false;
	}
	public static void main(String[] args) {
		System.out.println(parrotTrouble(true, 6));
		System.out.println(parrotTrouble(true, 7));
		System.out.println(parrotTrouble(false, 6));
	
	}
}