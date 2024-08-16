package CodingProblems;
import java.util.Scanner;

public class Electricity_Bill {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
      System.out.println("entr units");
      int units=sc.nextInt();
      E_calculation e= new E_calculation();
      int i=e.getAmount(units);
      System.out.println("Amount: "+i);
	}

}
class E_calculation
{
	public int getAmount(int units)
	{
		int amount =0;
		if(units>=0 && units<=50)
		{
			amount=units*5;
		}
		else
		{
				amount = 50*5; // if we put units in place of 50 it will multiplies total units with 5,but we require only 5Rs for 50 units.
				amount = amount+(units-50)*7; // removing 50 initial 50 units and calculate 7 Rs per remaining units.
			
//			amount =amount+50*5;
//			amount=amount+(units-50)*7;
		}
		
		return amount;
	}
}

