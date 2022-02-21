//Write a Java program to check whether a given number is an ugly number.
//In number system, ugly numbers are positive numbers whose only prime factors are 2, 3 or 5. First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By convention, 1 is included.

package NumberClass;


	import java.util.Scanner;
	public class Ex1 {
	       public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input an integer number: ");
	        int n = in.nextInt();  		
	        if (n <= 0) {
	            System.out.print("Input a correct number.");
	        }
			int x = 0;
	        while (n != 1) {
	            if (n % 5 == 0) {
	                n /= 5;
	            } else if (n % 3 == 0) {
	                n /= 3;
	            } else if (n % 2 == 0) {
	                n /= 2;
	            } else {
	                System.out.print("It is not an ugly number.");
					x = 1;
					break;
	            }
	        }
	        if (x==0)
			System.out.print("It is an ugly number.");
			System.out.print("\n");
		    }
	
}
