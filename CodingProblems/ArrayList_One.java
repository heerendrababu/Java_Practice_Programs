package CodingProblems;

import java.util.ArrayList;

public class ArrayList_One {

	public static void main(String[] args)
	{
       int[] arr= {2,5,8,10,13,17,20,22,25,30};
       ArrayList<Integer> evenList=new ArrayList<>();
       ArrayList<Integer> oddList=new ArrayList<>();
       for(int num:arr)
       {
    	   if(num%2==0)
    	   {
    		   evenList.add(num);
    	   }
    	   else
    	   {
    		   oddList.add(num);
    	   }
       }
       
       //Print even numbers and odd numbers
       System.out.print("Even numbers: "+evenList);
       System.out.println();
       System.out.print("odd numbers: "+oddList);
//       for(int num : evenList)
//       {
//    	   System.out.print(num+" ");
//       }
//       System.out.println();
//       
//       //print odd numbers
//       System.out.print("Odd numbers: ");
//       for(int num : oddList)
//       {
//    	  System.out.print(num+" "); 
//       }
//       System.out.println();
	}

}
