package calculationinput;
import java.util.Scanner;

import compounndinterest.Compoundinterest;
import simpleinterest.Simpleinterest;
public class Calculationinput {
	public static void main(String[] args)
	{
		Scanner object = new Scanner(System.in);//scanning the objects in to code;
		
		System.out.println("calculate simple intrest and compound ");
		
		
		
		System.out.println("1.simple intrest");
		System.out.println("2.compound intrest");
		System.out.println("select the option");
		int ch = object.nextInt();//scanning out the choice into code
		
		
		System.out.println();
		
		if(ch==1)
		{
			Simpleinterest.simpleinterestcalculation();
		}
		if(ch==2)
		{
			Compoundinterest.compoundinterestcalculation();
		}
		object.close();
	}

}
