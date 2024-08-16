package com.loops.java;
import java.util.Scanner;

public class Difference {

	public static void main(String[] args)
	{
     int[] arr=new int[5];
     Scanner sc=new Scanner(System.in);
     System.out.println("enter numbers");
     int evensum=0;
     int oddsum=0;
     for(int i=0;i<=arr.length-1;i++)
     {
    	 arr[i]=sc.nextInt();
     }
     for(int i=0;i<=arr.length-1;i++)
     {
    	 if(arr[i]%2==0)
    	 evensum=evensum+arr[i];
    	 else
    	 oddsum=oddsum+arr[i];
     }
     if(evensum>oddsum)
     {
    	 System.out.println("palle");
     }
     else
    	 System.out.println("dotnet");
	}

}
