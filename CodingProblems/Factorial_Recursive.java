package CodingProblems;
import java.util.Scanner;

public class Factorial_Recursive {

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		  int	n=sc.nextInt();
		  
		  if(n<0)
		  {
			  System.out.println("Factorial is not defined for negative numbers");
		  }
		  else
		  {
			 int fact = factorial(n);
		  System.out.println(fact);
		  }
   }
	

		public static int factorial(int n)
		{
			if(n ==0 || n==1)
			{
				return 1;
			}
			else 
				return n*factorial(n-1); //  In the Recursive call ,here we are calling factorial method with 'n-1'-
			//as the argument.This means we are calculating the factorial of (n-1) and last multiplying it with n 
		}
	
}