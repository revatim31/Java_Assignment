//Write a program to calculate the sum of following series where n = 9
//1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
package loopsAndDecisionMaking;
import  java.io.*;
public class Ex9 {
	
	 static int factorial(int n)
	    {
	        int res = 1;
	        for (int i = 2; i <= n; i++)
	        res *= i;
	        return res;
	    }
	     
	    // A Simple Function to return value
	    // of 1/1! + 1/2! + .. + 1/n!
	    static double sum(int n)
	    {
	        double sum = 0;
	        for (int i = 1; i <= n; i++)
	            sum += 1.0/factorial(i);
	        return sum;
	    }
	 
	    // Driver program
	    public static void main (String[] args)
	    {
	        int n = 5;
	        System.out.println(sum(n));
	    }
	}
	
