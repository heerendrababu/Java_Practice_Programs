package ImportantPrograms;

public class DuplicateElementPrinting {

	public static void main(String[] args) 
	{
       int[] arr = {4,2,4,5,6,2};
       for(int i=0;i<=arr.length-1;i++)
       {
    	   for(int j=i+1;j<=arr.length-1;j++)
    	   {   
    	   if(arr[i]==arr[j])
    	   {
    		   System.out.println("Duplicate element is:"+arr[i]);
    	   }
    	   }
       }
	}

}
