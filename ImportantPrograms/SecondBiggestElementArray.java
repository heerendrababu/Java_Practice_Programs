package ImportantPrograms;

public class SecondBiggestElementArray
{

	public static void main(String[] args) 
	{
       int[] arr = {10,20,40,20,60,55,80};
       int big = arr[0];
       int sbig = arr[0];
       for(int i=0;i<=arr.length-1;i++)
       {
    	 if(arr[i]>big)
    	 {
    		 big = arr[i];
    	 }
       }
       System.out.println(big);
       System.out.println();
       for(int i =0;i<=arr.length-1;i++)
       {
    	   if(arr[i]>sbig&& arr[i]<big)
    	   {
    		   sbig = arr[i];
    	   }
       }
       System.out.println(sbig);
       
       
	}
}
