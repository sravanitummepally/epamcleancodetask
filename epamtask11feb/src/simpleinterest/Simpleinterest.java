package simpleinterest;
import java.util.Scanner;

import calculationinput.Calculationinput;
public class Simpleinterest extends Calculationinput{
	public static void simpleinterestcalculation ()
	{
		int principal,rateofinterest,termofloanindeposit;
		Scanner object=new Scanner(System.in);
		
		
		System.out.println("enter the value of initial amount of the loan taken");
		principal = object.nextInt();


		System.out.println("enter the of rateofinterest");
		rateofinterest = object.nextInt();

		System.out.println("enter the of termofloanindeposit");
		termofloanindeposit = object.nextInt();
		
		int totalsimpleintrest = (principal * rateofinterest *termofloanindeposit)/100;//calculating the total interest
		
		
		object.close();
		
		System.out.println(totalsimpleintrest);
		
		
		
		
		
	

	}
	

}
