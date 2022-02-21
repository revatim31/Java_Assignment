//Exercise 1 : Write a program to print the value of variable int i=5 using prefix and post fix ++ operator.
package BasicOperators;

public class Ex1 {

    
    	 public static void main(String[] args) {
    	        // In this program, we will use the value of x for understanding prefix 
    	        // and the value of y for understaning postfix. 
    	   

    	        int x = 5; 
    	        int y = 5; 

    	           System.out.println(++x);  // 6   This is prefixing. 1 is added before x is used. 
    	           System.out.println(y++);  // 5   This is postfixing. y is used first and 1 is added. 

    	        System.out.println("---------- just for differentiating");

    	        System.out.println(x);  // 6   In prefixing, the value is same as before {See line 13}
    	        System.out.println(y);  // 6   In postfixing, the value increases by 1  {See line 14} 

    	        // Conclusion: In prefixing (++x), the value of x gets increased first and the used 
    	        // in an operation. While, in postfixing (y++), the value is used first and changed by
    	        // adding the number. 
    	    }
}

