package compounndinterest;
import java.util.Scanner;

import calculationinput.Calculationinput;
public class Compoundinterest extends Calculationinput {
	public static void compoundinterestcalculation()
	{
		int p,r,n,t;
		Scanner object =new Scanner(System.in);
/*A = the future value of the investment/loan, including interest
P = the principal investment amount (the initial deposit or loan amount)
r = the annual interest rate (decimal)
n = the number of times that interest is compounded per unit t
t = the time the money is invested or borrowed for*/
		
		
		
		System.out.println("enter the principal investment amount (the initial deposit or loan amount)");
		p = object.nextInt();
		
		
		System.out.println("enter the annual interest rate (decimal)");
		r = object.nextInt();
		
		System.out.println("enter the number of times that interest is compounded per unit t");
		n = object.nextInt();
		
		
		System.out.println("enter the time the money is invested or borrowed for");
		t = object.nextInt();
		
		
		object.close();//closing the object
		
		
		int a = (p* (1 + r/n))^ (n*t);//calculation the intrest
		
		System.out.println(a);
		

	
	}

}
