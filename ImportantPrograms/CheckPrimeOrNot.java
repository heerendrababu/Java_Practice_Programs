package ImportantPrograms;

public class CheckPrimeOrNot {

	public static void main(String[] args)
	{
     
     int n =  isPrime(4);
      System.out.println(n+": is prime");
      
	}
    public static int isPrime(int n)
    {
    	int count =0;
    	for(int i=1;i<=n;i++)
    	{
    		if(n%i==0)
    		{
    			count++;
    		}
    	}
    	if(count==2)
    	{
    		return n;
    	}
		return n;
    	
    }
}
