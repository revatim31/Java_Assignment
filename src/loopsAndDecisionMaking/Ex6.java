// Write a program to print Fibonacci series of n terms where n is input by user :

package loopsAndDecisionMaking;


	import java.util.Scanner;
	public class Ex6 {
	    public static void main(String[] args) 
	    {
	        int n, a = 0, b = 0, c = 1;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter value of n:");
	        n = s.nextInt();
	        System.out.print("Fibonacci Series:");
	        for(int i = 1; i <= n; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	            System.out.print(a+" ");
	        }
	    }
	}

