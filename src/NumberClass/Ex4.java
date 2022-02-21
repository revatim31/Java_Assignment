/*Exercise 4 :Write a Java program to find and print the first 10 happy numbers.

Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1. 
Example: 19 is a happy number
12 + 92=82 (1st iteration)
82 + 22=68 (2nd iteration)
62 + 82=100(3rd iteration)
12 + 02 + 02=1(4th iteration)

(hint: to avoid infinite loop consider iterating for 100 times only )

Expected Output

First 10 Happy numbers:                                                 
1                                                                       
7                                                                       
10                                                                      
13                                                                      
19                                                                      
23                                                                      
28                                                                      
31   
*/



package NumberClass;

public class Ex4 {

	 public static int isHappyNumber(int n)
	    {  
	        int rem = 0, sum = 0;  
	          
	        
	        while(n > 0){  
	            rem = n%10;  
	            sum = sum + (rem*rem);  
	            n = n/10;  
	        }  
	        return sum;  
	    }  
	      
	    public static void main(String[] args) {  
	          
	       
	        System.out.println("List of happy numbers between 1 and 10: ");  
	        for(int i = 1; i <= 10; i++){  
	            int result = i;  
	              
	      
	            while(result != 1 && result != 4){  
	                result = isHappyNumber(result);  
	            }  
	              
	            if(result == 1)  
	                System.out.print(i + " ");  
	        }  
	    }  
}
