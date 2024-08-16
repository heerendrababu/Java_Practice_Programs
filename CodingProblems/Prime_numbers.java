package CodingProblems;

public class Prime_numbers 
{
   // 1 to 100 prime numbers
	
	public static void main(String[] args) 
	{
       int a=0;
       for(int i=1;i<=100;i++)
       {
    	   int count =0;
    	   for(int j=1;j<=i;j++)
    	   {
    		 if(i%j==0)
    		 {
    			 count++;
    		 }
    	   }
    	   if(count == 2)
    	   {
    		   System.out.print(i+" ");
    		   a++;
    	   }
       }
       System.out.println("Total no.of prime numbers: "+ a);
	}

}
