package com.loops.java;
import java.util.Scanner;

public class Square_stars {

	public static void main(String[] args) {
     System.out.println("enter a number");
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     PatternOne p=new PatternOne();
     p.getPattern(n);
     
	}

}
class PatternOne
{
	public void getPattern(int n)
	{
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i == 0||i == n-1||j == 0||j == n-1)
					System.out.print("*"+"");		
				else 
					System.out.print("   ");	
			}
			System.out.println();
		}	
	}
}