package CodingProblems;
import java.util.Scanner;
public class First_Ten_Prime_numbers {

	public static void main(String[] args) 
	{
//      int num=1;
//      int count=1;
//      while(count<=10)
//      {
//    	  int fact=0;
//    	  for(int i=1; i<=num; i++)
//    	  {
//    		  if(num %i ==0)
//    		  {
//    			  fact++;
//    		  }
//    	  }
//    	  if(fact ==2)
//    	  {
//    		  count++;
//    		  System.out.print(num+" ");
//    	  }
//    	  num++;
//      }
		
	// In run time giving values
	Scanner sc=new Scanner(System.in);
	System.out.println("enter condition number");
	int s= sc.nextInt();
	 for(int i=1;i<=s;i++)
	 {
		 System.out.print(i+",");
	 }
	}
	}
