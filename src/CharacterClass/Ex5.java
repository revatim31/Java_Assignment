
/*: What is output of below statement

	 System.out.println(Character.toLowerCase('A'));  

     System.out.println(Character.toLowerCase(65));    

 */
 package CharacterClass;
 import java.io.*;

public class Ex5 {
	
	    public static void main(String[] args) {  
	      
	    	char ch1, ch2, ch3, ch4; 
	    	int no = 65;  
	       ch1 = 'A';  
	      ch2 = (char)no;  
	       
	      // Assign the lowercase of ch1 and ch2 to ch and ch4 respectively.  
	      ch3 = Character.toLowerCase(ch1);  
	      ch4 = Character.toLowerCase(ch2);  
	      String str1 = "The lowercase for the first character '" + ch1 + "' is given as: " + ch3;  
	      String str2 = "The lowercase for the second character '" + ch2 + "' is given as: " + ch4;  
	      // Print the values for ch3 and ch4.  
	      System.out.println( str1 );  
	      System.out.println( str2 );  
	      }  
	 
}
