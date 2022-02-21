//Write a program to determine if the input character is a digit or a alphabet.Use Character.isDigit() method.
package CharacterClass;

public class Ex2 {
	
	    public static void main(String[] args) {  
	       // Create three char primitives: obj1, obj2, and obj3.  
	          char obj1, obj2, obj3;  
	       // Assign the values to obj1, obj2 and obj3 respectively.  
	          obj1 = ' ';  
	          obj2 = '4';  
	          obj3 = '8';  
	       // Create three boolean primitives b1, b2 and b3.  
	          boolean b1, b2,b3;  
	       //Assign isDigit results of obj1, obj2 and obj3 to b1, b2, and b3 respectively.  
	          b1 = Character.isDigit(obj1);  
	          b2 = Character.isDigit(obj2);  
	          b3 = Character.isDigit(obj3);  
	          String str1 = "The digit '" +  obj1 +"' is:"+b1;  
	          String str2 = "The digit '" +  obj2 +"' is:"+b2;  
	          String str3 = "The digit '" +  obj3 +"' is:"+b3;  
	       // Print the values of b1, b2 and b3.  
	          System.out.println( str1 );  
	          System.out.println( str2 );  
	          System.out.println( str3 );  
	       }  
	    
}
