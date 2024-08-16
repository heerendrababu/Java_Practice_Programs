package com.loops.java;
import java.util.Scanner;

public class Eligibility {

	public static void main(String[] args)
	{
	  
      int[] age=new int[10];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter voter's age");
      for(int i=0;i<age.length;i++) {
    	  age[i]=sc.nextInt();
      }
      for(int i=0;i<age.length;i++) {
         if(age[i]>18)
    	  System.out.println("eligible");
      else
    	  System.out.println("not eligible");
    	  
	}
	}

}
