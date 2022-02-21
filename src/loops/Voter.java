//Exercise 15: Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible to vote.
//A person who is eligible to vote must be older than or equal to 18 years old.
package loops;
import java.util.Scanner;

public class Voter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		
		if(age>=18) 
		{
			System.out.println("You are eligible for voting");			
		}
		 else 
		{
			System.out.println("You are not eligible for voting");
		}
	}
}