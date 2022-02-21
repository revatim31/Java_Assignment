// Write a Java program to check a number is a cube or not.
package NumberClass;


	import java.util.*;
	public class Ex3 {
	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        int num;
	     
	        System.out.print("Enter an integer number: ");
	        num=sc.nextInt();
	        System.out.println("Cube of "+ num + " is: "+ Math.pow(num, 3));
	        
	    }
	
}
