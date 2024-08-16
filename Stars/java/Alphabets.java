package com.Stars.java;

public class Alphabets
{
   public static void main(String[] args)
	{
	   char ch[] = {'a','b','c','d'};
	   for(int i=0;i<ch.length;i++)
       {
    	   for(int j=0;j<=i;j++)
    	   {
    		   System.out.print(ch[j]+" ");
    		   
    	   }
    	   System.out.println();
       }
	   int rows =5;
	   for(int i=1;i<=rows;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(j+" ");
		   }
		   System.out.println();
	   }
	   int n=5;
	   char count='a';
	   for(int i=1;i<=n;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(count+" ");
		       count++;
		   }
		   System.out.println();
       }
	}

}
