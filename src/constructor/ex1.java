
//Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, 
//then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.


package constructor;

 class student {
     String ss;
    String name;
  public student(String ss){
      name = ss;
  }
  public student()
  {
      name = "unknown";
  }
}
public class ex1{
    public static void main(String[] args) {

    	//student obj = new student("Raju");
    	student obj = new student();
        obj.ss = "Vivek";
        
        System.out.println(obj.ss);
        System.out.println(obj.name);

    }
}