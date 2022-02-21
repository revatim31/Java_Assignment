//Write a program to create a Accountant class with parameters name , emailId and contactNo. Write a method to view all the accountants information.

//eg. Accountant Ravi has mail id ravi@gmail.com and contact No 9867785694 . Accountant Rutuja has mail id rutuja@gmail.com and contact No 9987565634.

package ObjectClass;
import java.io.*;
class AccountD {
	
		String fname;
		String email;
		   int contactno;
		   
		 

		   
		   public AccountD(String fname) {
		      this.fname = fname;
		   }
		   public void email(String email) {
			      this.email = email;
			   }
		  
		   public void contactNo(int contactno) {
			   this.contactno = contactno;
		   }

		   public void printAccountD() {
		      System.out.println("Accountant"+ fname+"has mail id"+ email+"and contact no "+ contactno );
		     
		        }
	}
		   public class AccountInfo{
		 public static void main(String args[]) {
		      
			 System.out.println("Accountant Info");		
					
			 AccountD actOne1 = new AccountD("Ravi");
			 AccountD actTwo2 = new AccountD("Rutuja");
			
		      // Invoking methods for each object created
			 actOne1.email("ravi@gmail.com");
			 actOne1.contactNo(775566776);
			 

			 actTwo2.email("rutuja@gmail.com");
			 actTwo2.contactNo(723456711);
			 
		   }

		   }

