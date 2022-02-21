//Exercise 14: Write a Java program to detect key presses. If the user pressed number keys( from 0 to 9), the program will tell
//the number that is pressed,  otherwise, program will show "Not allowed".(Hint: Use switch case)
package loops;

import java.util.Scanner;
public class Keys {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Press a key : ");
		char c = (in.next()+"").charAt(0);
		
		switch(c) {
		case '1':
			System.out.println(1);
			break;
		case '2':
			System.out.println(2);
			break;		
		case '3':
			System.out.println(3);
			break;
		case '4':
			System.out.println(4);
			break;
		case '5':
			System.out.println(5);
			break;
		case '6':
			System.out.println(6);
			break;
		case '7':
			System.out.println(7);
			break;
		case '8':
			System.out.println(8);
			break;
		case '9':
			System.out.println(9);
			break;
		case '0':
			System.out.println(0);
			break;		
		default:
			System.out.println("Not allowed");
			
		}
	}
}