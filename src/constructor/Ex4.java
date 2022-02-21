//Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
//For example, while creating object if we pass "Java", then "I love Java" should be printed.

package constructor;


import java.util.Scanner;

class tri{
     String ss;
    String name ;
    public tri(String ss)
    {
        name = ss;
    }
    public tri(){
        name = "I love programming languages ";
    }
        }





public class  Ex4 {
    public static void main(String[] args) {
        tri obj = new tri();
        obj.ss = "Java";
        System.out.println("I love " + obj.ss);
        System.out.println(obj.name);

    }
}