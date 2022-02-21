package ObjectClass;
import java.io.*;
import java.util.Scanner;
 class Account {
	String fname;
	String lname;
	   int age;
	   int actbal;
	 

	   
	   public Account(String fname) {
	      this.fname = fname;
	   }
	   public void lastname(String lname) {
		      this.lname = lname;
		   }
	  
	   public void actAge(int age) {
		   this.age = age;
	   }

	  
	   public void actbalance(int actbal) {
		   this.actbal = actbal;
	   }
	   public void testEligibilityForCC() {
		   
		   if(age>21 && actbal>20000) {
			   
			   System.out.println("Eligible for credit card" ); 
			   
		   }
		   else {
			   System.out.println("Not Eligible for credit card" );
		   }
		   }
	 
	   

	   
	   public void printAccount() {
	      System.out.println("first Name:"+ fname );
	      System.out.println("last Name:"+ lname );
	      System.out.println("Age:" + age );
	      
	      System.out.println("Account balance:" + actbal);
	   }
}
	   public class AccountHolder{
	 public static void main(String args[]) {
	      
				
				
		 Account actOne = new Account("Tom");
		 Account actTwo = new Account("Henery");
		 Account actThree = new Account("Sarah");
	      // Invoking methods for each object created
		 actOne.lastname("smith");
		 actOne.actAge(21);
		 actOne.actbalance(10000);
		 actOne.printAccount();
		 actOne.testEligibilityForCC();

		 actTwo.lastname("Hill");
		 actTwo.actAge(31);
		 actTwo.actbalance(20000);
		 actTwo.printAccount();
		 actTwo.testEligibilityForCC();
		 
		 actThree.lastname("miller");
		 actThree.actAge(41);
		 actThree.actbalance(30000);
		 actThree.printAccount();
		 actThree.testEligibilityForCC();
	   }

}
