//Exercise 1 : Write a Java program to declare a Boolean variable with initial value of “true” 
//and later change it to “false” before printing it.
package DataTypes;

public class ChangeValue
{
	public static void main(String[] args)
	{
	boolean value = true;
	    System.out.println(value);
	    value=!value;
		System.out.println(value);
		value=!value;
	}
}