package com.Stars.java;

public class Reverse_Pyramid
{
	public static void main(String[] args)
	{
		int rows=4;
		for(int i=rows;i<=4;i++)
		{
			for(int j=8;j>=(rows*2)-i;j--) {
				if(j<=i)
				{
					System.out.print(" ");
				}
				else 
					System.out.print("*");
			}
			System.out.println();
			
		}
	} 
}
