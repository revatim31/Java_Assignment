//Write a program to check that 29 is a prime number or not using for loop. 

package loopsAndDecisionMaking;

public class Ex1 {
	

		  public static void main(String[] args) {

		    int num = 29;
		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}

