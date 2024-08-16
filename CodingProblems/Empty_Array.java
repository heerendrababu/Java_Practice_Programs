package CodingProblems;

public class Empty_Array {

	public static void main(String[] args) 
	{
		int[] arr= {10,2,3,5,8,13,4,5,22,11};
		int[] evenArray= new int[arr.length];
		int[] oddArray=new int[arr.length];
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
			  	evenArray[evenCount]=arr[i];
			  	evenCount++;
			}
			else 
			{
				oddArray[oddCount]=arr[i];
				oddCount++;
			}
		}
       
     System.out.print("even numbers");
     for(int i=0;i<evenCount;i++)
     {
    	 System.out.println(evenArray[i]+" ");
     }
     System.out.println();
     System.out.print("odd numbers");
     for(int i=0;i<oddCount;i++)
     {
    	 System.out.println(oddArray[i]+" ");
     }
     System.out.println();
	}

}
