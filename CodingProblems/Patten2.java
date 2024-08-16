package CodingProblems;

public class Patten2 {

	public static void main(String[] args) 
	{
       for(int i=4;i>=1;i--)
       {
    	   for(int j=1;j<=6-i;j++)
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
