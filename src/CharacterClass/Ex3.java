//Write a program to print all input characters to upper case. Use method Character.toUpperCase(). 


package CharacterClass;

public class Ex3 {
	  
	    public static void main(String[] args) {  
	      // Create four char primitives.  
	        char ch1, ch2, ch3, ch4;  
	      // Assign the values to ch1 and ch2.  
	      ch1 = 'm';  
	      ch2 = 'q';  
	      // Assign the uppercase of ch1 and ch2 to ch3 and ch4 respectively.  
	      ch3 = Character.toUpperCase(ch1);  
	      ch4 = Character.toUpperCase(ch2);  
	      String str1 = "The uppercase of the character '" + ch1 + "' is given as: " + ch3;  
	      String str2 = "The uppercase of the character '" + ch2 + "' is given as: " + ch4;  
	      // Print the values of ch1 and ch2.  
	      System.out.println( str1 );  
	      System.out.println( str2 );  
	   }  
	  
}
