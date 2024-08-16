package CodingProblems;

public class Selection_Sort {

	public static void main(String[] args)
	{
      int[] arr= {12,32,0,15,22,56,1,2,545,1,2,2,02222};
      for(int i=0;i<arr.length-1;i++)
      {
    	  int smallest=i;
    	  for(int j=i+1;j<=arr.length-1;j++)
    	  {
    		  if(arr[smallest]>arr[j])
    		  {
    			  smallest=j;
    		  }
    	  }
      
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
        System.out.print(arr[i]+",");
        
     }
      System.out.println("1150.");
     
	}

}
