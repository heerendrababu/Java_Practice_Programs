package CodingProblems;

public class Check_PrimeOrNot {

	public static void main(String[] args)
	{
	  
		int a =1;
		int count =0;
		for(int i=1;i<=a;i++)
		{
			if(a % i== 0)
			{
				count++;   
			}
		}
		if(count == 2)
		{
			System.out.println(a+" is a prime number");
		}
		else
			System.out.println(a+" is not a prime number");


	}

}
