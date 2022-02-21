//Create a employee class with name and employeeId . Print the sorted list of employees by name .
package Collection;

import java.lang.String;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.List;
	
	 class Employee implements Comparable<Employee> {
		 
		 private int id;
		 private String name;
		 private int age;
		 
		 public Employee(int id, String name, int age) {
		  super();
		  this.id = id;
		  this.name = name;
		  this.age = age;
		 }
		 
		 public int getId() {
		  return id;
		 }
		 
		 public void setId(int id) {
		  this.id = id;
		 }
		 
		 public String getName() {
		  return name;
		 }
		 
		 public void setName(String name) {
		  this.name = name;
		 }
		 
		 public int getAge() {
		  return age;
		 }
		 
		 public void setAge(int age) {
		  this.age = age;
		 }
		 
		 
		 @Override
		 public int compareTo(Employee o) {
		 
			 return name.compareTo(o.name); 
		 
		 }
		  
		 @Override
		  public String toString() {
		   return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
		  }
		 
		}
	
	public class Ccc1 {
	 public static void main(String[] args) {
	  List<Employee> emps = new ArrayList<>();
	 
	  emps.add(new Employee(105, "Ajay", 38));
	  emps.add(new Employee(101, "vijay", 31));
	  emps.add(new Employee(103, "Ram",36));
	 
	  System.out.println("Before sorting  list of employees : ");
	  Iterator<Employee> it = emps.iterator();
	  while (it.hasNext()) {
	   System.out.println(it.next());
	  }
	  Collections.sort(emps);
	 
	  System.out.println("\n\nAfter sorting  list of employees by name: ");
	  it = emps.iterator();
	  while (it.hasNext()) {
	   System.out.println(it.next());
	  }
	 }
	 }	
	 
