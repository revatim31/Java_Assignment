/*:What is the output of below statement

		System.out.println(Character.isWhitespace('A'));  

        System.out.println(Character.isWhitespace(' '));  

        System.out.println(Character.isWhitespace('\n'));  

        System.out.println(Character.isWhitespace('\t'));  */
package CharacterClass;
import java.io.*;
public class Ex4 {
	
	    public static void main(String[] args) {  
	        // Create three char primitives:ch1, ch2 and ch3  
	        char ch1, ch2, ch3, ch4;
	                 
	        // Assign the values to the char primitives.  
	        ch1 = 'A';  
	        ch2 = ' ';  
	        ch3 = '\n';  
	        ch4 = '\t';
	        //Create three boolean primitives.  
	        boolean b1, b2, b3,b4;  
	       b1 =  Character.isWhitespace(ch1);  
	       b2 =  Character.isWhitespace(ch2);  
	       b3 =  Character.isWhitespace(ch3); 
	       b4 =  Character.isWhitespace(ch4);
	      System.out.println("The first character is a white space character :"+b1);  
	      System.out.println("The second character is a white space character :"+b2);  
	      System.out.println("The third character is a white space character :"+b3); 
	      System.out.println("The fourth character is a white space character :"+b4);
	   }  
	  
}
