package com.Stars.java;

public class Pyramid_Shape {

	public static void main(String[] args)
	{
      for(int i=4;i>=1;i--)
      {
    	  for(int j=1;j<=8-i;j++)
    	  {
    	  if(j<i)
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

