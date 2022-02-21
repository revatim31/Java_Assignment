/*Exercise 13 : Write a Java program to calculate the revenue from a sale based on the unit price and quantity of a product input by the user.The discount rate is 10% for the quantity purchased between 100 and 120 units, and 15% for the quantity purchased greater than 120 units. If the quantity purchased is less than 100 units, the discount rate is 0%. See the example output as shown below:

Enter unit price: 25

Enter quantity: 110

The revenue from sale: 2475.0$

After discount: 275.0$(10.0%)*/

package loops;

import java.util.Scanner;

public class Revenue 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Unit Price : ");
		int price = in.nextInt();
		
		System.out.println("\nEnter Quantity :");
		int q = in.nextInt();
		
		int d = 0;//d=discount and q=quantity
		if(q>=100) 
		{
			d=10;
		}
		if(q>120) 
		{
			d = 15;
		}
		
		System.out.println("The revenue from sale: "+((float)(q*price)-((q*price)*d)/100)+"$");
		System.out.println("After discount: "+((float)((q*price)*d)/100)+"$("+(float)d+"%)");
	}
}