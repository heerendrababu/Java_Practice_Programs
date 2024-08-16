package CodingProblems;

public class Demo_Array_01 {

	public static void main(String[] args)
	{
        int [] arr = {30,29,36,42,54,9,1,4,22,1};
        int[] arr1 = new int[arr.length];
        for(int i=0;i<=arr.length-1;i++)
        {
        	if(arr[i]>30)
        	{
        		arr1[i]=arr[i];
        		System.out.print(arr1[i]+",");
        	}
        	
        }
	}

}
