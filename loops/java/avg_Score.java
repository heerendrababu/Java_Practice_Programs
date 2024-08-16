package com.loops.java;
import java.util.Scanner;

public class avg_Score
{
	public static void main(String[] args)
	{ int[] scores= new int[5];  
      Scanner sc=new Scanner(System.in);
      System.out.println("enter scores :");
      int sum=0;
      int avg=0;
      for(int i=0;i<=scores.length-1;i++)
      {
    	  scores[i]=sc.nextInt();
    	//  sum=sum+arr[i];//or
    	  
    	  
      }
     // System.out.println(sum);
     // System.out.println(sum);
      for(int i=0;i<=scores.length-1;i++)
      {
    	  sum=sum+scores[i];
      }
      System.out.println(sum);
      avg=sum/scores.length;
      System.out.println("Avg: "+avg);
     
      
	}
}
