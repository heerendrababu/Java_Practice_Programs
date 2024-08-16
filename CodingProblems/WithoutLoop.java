package CodingProblems;

import java.util.Scanner;

public class WithoutLoop {

	public static void main(String[] args)
	{
	  for(int i=1;i<=20;i++)
	  {
		  if(i%2==0)
		  {  
		  System.out.print(i+",");
		  }
	  }
	  System.out.println();
	  Test1001.printNumbers(2);
	  
         
       }

}
class Test1001
{
	public static void printNumbers(int n)
	{
		if(n<=20 && n%2==0)
		{
          
      	System.out.print(n+",");
      	printNumbers(n+2);
		}
        
	}
}
