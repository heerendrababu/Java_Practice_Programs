package CodingProblems;

import java.util.Scanner;

public class Count 
{

	public static void main(String[] args)
	{
       Scanner sc  = new Scanner(System.in);
       System.out.println("enter String");
       String s = sc.nextLine();
		
       int count = 1;
       for(int i =0;i<=s.length()-1;i++)
       {
    	   if(s.charAt(i) ==' ')
    	   {
    		   count++;
    	   }
       }
       System.out.println(count);
	}

}
