package CodingProblems;

public class Even_Sum {

	public static void main(String[] args)
	{
     int[] arr= {2,4,5,3,1,4};
     int evensum=0;
     int oddsum=0;
     for(int i=0;i<=arr.length-1;i++)
     {
       if(arr[i]%2==0)
        evensum=evensum+arr[i]; 
       else
    	   oddsum=oddsum+arr[i];
    	   
     }
     System.out.println("evensum: "+evensum);
     System.out.println("oddsum: "+oddsum);
	}

}
