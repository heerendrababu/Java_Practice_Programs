package CodingProblems;

public class FibonacciSeries
{
  // By adding previous two numbers we can get fibonacci series.
	public static void main(String[] args)
	{
	    int x = 0;
	    int y = 1;
	    int temp =0;
	    System.out.print(x+",");
	    System.out.print(y+",");
	    int n=8;
	    
	    for(int i=0;i<=n;i++)
	    {
	    	temp = y+x;
	    	  x = y;
	    	  y = temp;
	    	  System.out.print(temp+",");
	    }
	}

}
