package CodingProblems;

public class Sum_Of_The_Array {

	public static void main(String[] args)
	{
	// Engineering Style
	int[] arr= {10,2,4,6,3};
    int sum=0;
    for(int i=0;i<=arr.length-1;i++)
    {
    	sum=sum+arr[i];
    }
    System.out.println(sum);
	}

}
