// Write a program to create a Student class with properties name , courseEnrolled . Write method getCourseEnrolled()
//that gives the result of the course enrolled by the student. eg Ram has enrolled for Java course , 
//Vicky has enrolled for HTML course and Reena has enrolled for Spring course.

package ObjectClass;

import java.util.Scanner;

public class Student {
 String name;
 String course;
 public void setName( String sname ) {
     name = sname;
  }

  public String getName( ) {
     System.out.println("studentname  is :" +name );
     return name;
  }
  public void setCourse( String scourse ) {
	     course= scourse;
	  }

	  public String getCourse( ) {
	     System.out.println("student course is :" +course );
	     return course;
	  }
	public void  getCourseEnrolled() {
		System.out.println(name+" has enrolled for " +course+"course" );
	
	}
  public static void main(String []args) {
     /* Object creation */
	  Scanner get = new Scanner(System.in);
	  Student std=new Student();
	  
	  System.out.println("Enter name" );
	 String name = get.nextLine();
     std.setName(name);
     
     std.setCourse("java" );
     
     std.getName( );
     std.getCourse( );
     std.getCourseEnrolled();

     
  }
}
